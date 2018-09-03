package com.gortaire.batch.mltopitems;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class MltopitemsApplication {

	private static final String CLIENT_ID = "5230521482661261";
	private static final String CLIENT_SECRET = "jNbTGxEWk5afVkq5KYtz0KGju00EQvei";
	private static final String ML_SITE="MLC";
	private static final String ML_TOKEN="https://api.mercadolibre.com/oauth/token?grant_type=client_credentials&client_id={CLIENT_ID}&client_secret={CLIENT_SECRET}";
	private static final String ML_CATEGORIES_ENDPOINT="https://api.mercadolibre.com/sites/{ML_SITE}/categories";
	private static final String ML_SUBCATEGORIES_ENDPOINT="https://api.mercadolibre.com/categories/{CATEGORY_ID}";
	private static final String ML_SEARCH_ENDPOINT="https://api.mercadolibre.com/sites/{ML_SITE}/search?category={CATEGORY_ID}";
	private static final String ML_ITEM_ENDPOINT="https://api.mercadolibre.com/items/{ITEM_ID}";
	private static final String ML_ITEM_VISITS_DAtE_RANGE="https://api.mercadolibre.com/items/{ITEM_ID}/visits?date_from={DATE_FROM}&date_to={DATE_TO}";

	public static void main(String[] args) {

		String TOKEN = null;

		List<Category> categoriesFullList = new ArrayList<Category>();

		SpringApplication.run(MltopitemsApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();

		Gson gson = new Gson();
		String result = restTemplate.postForObject(ML_TOKEN.replace("{CLIENT_ID}",CLIENT_ID).replace("{CLIENT_SECRET}",CLIENT_SECRET), null, String.class);
		JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
		TOKEN = jsonObject.get("access_token").toString();
		System.out.println("################## TOKEN["+TOKEN+"]");
		result = restTemplate.getForObject(ML_CATEGORIES_ENDPOINT.replace("{ML_SITE}",ML_SITE), String.class);
		System.out.println("################## CATEGORIAS:["+result+"]");
		Collection<Category> categoriesList = gson.fromJson(result,new TypeToken<List<Category>>(){}.getType());
		System.out.println("################## TOTALCATEGORIAS:["+categoriesList.size()+"]");
		for(Category category : categoriesList){
			categoriesFullList.add(category);
			System.out.println("################## CATEGORY:[ID["+category.getId()+"],NAME["+category.getName()+"]]");
			result = restTemplate.getForObject(ML_SUBCATEGORIES_ENDPOINT.replace("{CATEGORY_ID}",category.getId()), String.class);
			Category categoryFull = gson.fromJson(result, Category.class);
			for(Category subCategory : categoryFull.getChildren_categories()){
				categoriesFullList.add(subCategory);
				System.out.println("################## SUBCATEGORY:[ID["+subCategory.getId()+"],NAME["+subCategory.getName()+"]]");
			}
		}
		System.out.println("################## TOTALCATEGORIAS:["+categoriesFullList.size()+"]");
		for(Category category : categoriesFullList){
			result = restTemplate.getForObject(ML_SEARCH_ENDPOINT.replace("{ML_SITE}",ML_SITE).replace("{CATEGORY_ID}",category.getId()), String.class);
			SearchResult searchResult = gson.fromJson(result, SearchResult.class);
			for(Item item : searchResult.getResults()){
				result = restTemplate.getForObject(ML_ITEM_ENDPOINT.replace("{ITEM_ID}",item.getId()), String.class);
				Item detailedItem = gson.fromJson(result, Item.class);
				System.out.println("################## ITEM:[ID["+detailedItem.getId()+"],TITLE["+detailedItem.getTitle()+"],PRICE["+detailedItem.getPrice()+"],INITIAL_QUANTITY["+detailedItem.getInitial_quantity()+"],["+detailedItem.getAvailable_quantity()+"],SOLD_QUANTITY["+detailedItem.getSold_quantity()+"]");
			}
		}
	}
}
