package com.gortaire.batch.mltopitems;

import java.util.List;

public class Category {

    private String id;
    private String name;
    private String picture;
    private String permalink;
    private Long total_items_in_this_category;
    private List<Category> path_from_root;
    private List<Category> children_categories;
    private String attribute_types;
    private Settings settings;
    private String meta_categ_id;
    private boolean attributable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Long getTotal_items_in_this_category() {
        return total_items_in_this_category;
    }

    public void setTotal_items_in_this_category(Long total_items_in_this_category) {
        this.total_items_in_this_category = total_items_in_this_category;
    }

    public List<Category> getPath_from_root() {
        return path_from_root;
    }

    public void setPath_from_root(List<Category> path_from_root) {
        this.path_from_root = path_from_root;
    }

    public List<Category> getChildren_categories() {
        return children_categories;
    }

    public void setChildren_categories(List<Category> children_categories) {
        this.children_categories = children_categories;
    }

    public String getAttribute_types() {
        return attribute_types;
    }

    public void setAttribute_types(String attribute_types) {
        this.attribute_types = attribute_types;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String getMeta_categ_id() {
        return meta_categ_id;
    }

    public void setMeta_categ_id(String meta_categ_id) {
        this.meta_categ_id = meta_categ_id;
    }

    public boolean isAttributable() {
        return attributable;
    }

    public void setAttributable(boolean attributable) {
        this.attributable = attributable;
    }
}
