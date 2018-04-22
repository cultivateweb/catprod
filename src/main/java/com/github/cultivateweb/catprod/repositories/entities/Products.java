package com.github.cultivateweb.catprod.repositories.entities;

import com.github.cultivateweb.catprod.model.Product;
import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class Products {

    @Id
    private Integer id;
    private Integer producerId;
    private Integer categoryId;
    private String name;
    private String alias;
    private String image;
    private Double price;
    private String description;
    private boolean exist;

    public Product toProduct() {
        return new Product(alias, name, price, description, image, exist);
    }

}
