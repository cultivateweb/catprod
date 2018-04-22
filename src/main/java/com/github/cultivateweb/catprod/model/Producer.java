package com.github.cultivateweb.catprod.model;

import lombok.Data;

public @Data class Producer {

    private String alias;
    private String name;
    private String image;

    public Producer() {
        //do nothing
    }

    public Producer(String alias, String name, String image) {
        this.alias = alias;
        this.name = name;
        this.image = image;
    }

}
