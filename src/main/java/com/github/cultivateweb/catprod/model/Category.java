package com.github.cultivateweb.catprod.model;

import lombok.Data;

public @Data class Category {

    private String alias;
    private String name;
    private String image;

    public Category() {
        //do nothing
    }

    public Category(String alias, String name, String image) {
        this.alias = alias;
        this.name = name;
        this.image = image;
    }

}
