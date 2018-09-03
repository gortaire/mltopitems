package com.gortaire.batch.mltopitems;

public class Item {

    private String id;
    private String title;
    private Long price;
    private Long base_price;
    private Long original_price;
    private String currency_id;
    private Long initial_quantity;
    private Long available_quantity;
    private Long sold_quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getBase_price() {
        return base_price;
    }

    public void setBase_price(Long base_price) {
        this.base_price = base_price;
    }

    public Long getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Long original_price) {
        this.original_price = original_price;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public Long getInitial_quantity() {
        return initial_quantity;
    }

    public void setInitial_quantity(Long initial_quantity) {
        this.initial_quantity = initial_quantity;
    }

    public Long getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(Long available_quantity) {
        this.available_quantity = available_quantity;
    }

    public Long getSold_quantity() {
        return sold_quantity;
    }

    public void setSold_quantity(Long sold_quantity) {
        this.sold_quantity = sold_quantity;
    }

    /*
    * {
  "id": "MLC446496788",
  "site_id": "MLC",
  "title": "Sobres Para Invitaciones Papel Kraft",
  "subtitle": null,
  "seller_id": 201092027,
  "category_id": "MLC116439",
  "official_store_id": null,
  "price": 340,
  "base_price": 340,
  "original_price": null,
  "currency_id": "CLP",
  "initial_quantity": 707,
  "available_quantity": 250,
  "sold_quantity": 250,
  "sale_terms": [
  ],
  "buying_mode": "buy_it_now",
  "listing_type_id": "gold_pro",
  "start_time": "2017-06-19T18:05:34.000Z",
  "stop_time": "2037-06-14T18:05:34.000Z",
  "condition": "new",
  "permalink": "https://articulo.mercadolibre.cl/MLC-446496788-sobres-para-invitaciones-papel-kraft-_JM",
  "thumbnail": "http://mlc-s1-p.mlstatic.com/447411-MLC20555805432_012016-I.jpg",
  "secure_thumbnail": "https://mlc-s1-p.mlstatic.com/447411-MLC20555805432_012016-I.jpg",
  "pictures": [
    {
      "id": "447411-MLC20555805432_012016",
      "url": "http://mlc-s1-p.mlstatic.com/447411-MLC20555805432_012016-O.jpg",
      "secure_url": "https://mlc-s1-p.mlstatic.com/447411-MLC20555805432_012016-O.jpg",
      "size": "500x417",
      "max_size": "1200x1002",
      "quality": ""
    },
    {
      "id": "416411-MLC20555807250_012016",
      "url": "http://mlc-s1-p.mlstatic.com/416411-MLC20555807250_012016-O.jpg",
      "secure_url": "https://mlc-s1-p.mlstatic.com/416411-MLC20555807250_012016-O.jpg",
      "size": "389x500",
      "max_size": "934x1200",
      "quality": ""
    }
  ],
  "video_id": null,
  "descriptions": [
    {
      "id": "MLC446496788-1372275957"
    }
  ],
  "accepts_mercadopago": true,
  "non_mercado_pago_payment_methods": [
  ],
  "shipping": {
    "mode": "not_specified",
    "methods": [
    ],
    "tags": [
      "me2_available"
    ],
    "dimensions": null,
    "local_pick_up": true,
    "free_shipping": false,
    "logistic_type": "not_specified",
    "store_pick_up": false
  },
  "international_delivery_mode": "none",
  "seller_address": {
    "comment": "",
    "address_line": "",
    "zip_code": "",
    "city": {
      "id": "TUxDQ1NBTjk4M2M",
      "name": "Santiago"
    },
    "state": {
      "id": "CL-RM",
      "name": "RM (Metropolitana)"
    },
    "country": {
      "id": "CL",
      "name": "Chile"
    },
    "search_location": {
      "neighborhood": {
        "id": "",
        "name": ""
      },
      "city": {
        "id": "TUxDQ1NBTjk4M2M",
        "name": "Santiago"
      },
      "state": {
        "id": "TUxDUE1FVEExM2JlYg",
        "name": "RM (Metropolitana)"
      }
    },
    "latitude": -33.44655,
    "longitude": -70.65119,
    "id": 174638989
  },
  "seller_contact": null,
  "location": {
  },
  "geolocation": {
    "latitude": -33.44655,
    "longitude": -70.65119
  },
  "coverage_areas": [
  ],
  "attributes": [
    {
      "id": "ITEM_CONDITION",
      "name": "Condición del ítem",
      "value_id": "2230284",
      "value_name": "Nuevo",
      "value_struct": null,
      "attribute_group_id": "OTHERS",
      "attribute_group_name": "Otros"
    }
  ],
  "warnings": [
  ],
  "listing_source": "",
  "variations": [
  ],
  "status": "active",
  "sub_status": [
  ],
  "tags": [
    "good_quality_picture",
    "dragged_bids_and_visits",
    "immediate_payment"
  ],
  "warranty": null,
  "catalog_product_id": null,
  "domain_id": null,
  "parent_item_id": "MLC435404774",
  "differential_pricing": null,
  "deal_ids": [
  ],
  "automatic_relist": false,
  "date_created": "2017-06-19T18:05:34.000Z",
  "last_updated": "2018-08-16T12:29:06.990Z",
  "health": null
}
    * */
}
