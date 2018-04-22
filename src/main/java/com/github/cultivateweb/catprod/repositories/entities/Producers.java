package com.github.cultivateweb.catprod.repositories.entities;

import com.github.cultivateweb.catprod.model.Producer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class Producers {

    @Id
    private Integer id;
    private String alias;
    private String name;
    private String image;

    public Producer toProducer() {
        return new Producer(alias, name, image);
    }

}
