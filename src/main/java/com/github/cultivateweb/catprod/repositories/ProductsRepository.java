package com.github.cultivateweb.catprod.repositories;

import com.github.cultivateweb.catprod.repositories.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

    @Query(value = "select distinct p.ID, p.ProducerID, p.CategoryID, p.Name, p.Alias, p.Image, p.Price, p.Description, p.Exist" +
                   "  from Products p" +
                   "  join Categories c" +
                   "    on p.CategoryID = c.ID" +
                   "  join Producers pr" +
                   "    on p.ProducerID = pr.ID" +
                   " where pr.Alias = ?1 and c.Alias = ?2 and c.Depth = 1", nativeQuery = true)
    List<Products> findAllByAliasProducerAndAliasCategory(String aliasProducer, String aliasCategory);

    List<Products> findAllByCategoryId(Integer id);
    Products findOneByAlias(String alias);

}
