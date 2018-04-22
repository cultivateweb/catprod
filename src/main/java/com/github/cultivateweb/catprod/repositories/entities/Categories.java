package com.github.cultivateweb.catprod.repositories.entities;

import com.github.cultivateweb.catprod.model.Category;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class Categories {

    @Id
    private Integer id;
    private Integer parentId;
    private Integer depth;
    private String alias;
    private String name;
    private String image;

    public Category toCategory() {
        return new Category(alias, name, image);
    }

}
