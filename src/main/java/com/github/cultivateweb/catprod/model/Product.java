package com.github.cultivateweb.catprod.model;

import lombok.Data;

public @Data class Product {

    private String alias;
    private String name;
    private double price;
    private String description;
    private String image;
    private boolean exist;

    public Product() {
        //do nothing
    }

    public Product(String alias, String name, double price, String description, String image, boolean exist) {
        this.alias = alias;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.exist = exist;
    }

}
