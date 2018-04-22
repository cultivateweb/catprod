package com.github.cultivateweb.catprod.repositories;

import com.github.cultivateweb.catprod.repositories.entities.Producers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducersRepository extends JpaRepository<Producers, Integer> {

    Producers findOneByAlias(String alias);

}
