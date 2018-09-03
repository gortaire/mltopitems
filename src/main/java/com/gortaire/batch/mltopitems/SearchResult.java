package com.gortaire.batch.mltopitems;

import java.util.List;

public class SearchResult {

    private String site_id;
    private List<Item> results;

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public List<Item> getResults() {
        return results;
    }

    public void setResults(List<Item> results) {
        this.results = results;
    }
}
