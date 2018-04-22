package com.github.cultivateweb.catprod.repositories;

import com.github.cultivateweb.catprod.repositories.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

    @Query(value = "select distinct pc.ID, pc.ParentID, pc.Depth, pc.Alias, pc.Name, pc.Image" +
                   "  from Products p" +
                   "  join Categories c" +
                   "    on p.CategoryID = c.ID" +
                   "  join Categories pc" +
                   "    on c.ParentID = pc.ID" +
                   "  join Producers pr" +
                   "    on p.ProducerID = pr.ID" +
                   " where pc.Depth = 0 and pr.Alias = ?1", nativeQuery = true)
    List<Categories> findAllByAliasProducer(String aliasProducer);

    @Query(value = "select distinct c.ID, c.ParentID, c.Depth, c.Alias, c.Name, c.Image" +
                   "  from Products p" +
                   "  join Categories c" +
                   "    on p.CategoryID = c.ID" +
                   "  join Categories pc" +
                   "    on c.ParentID = pc.ID" +
                   "  join Producers pr" +
                   "    on p.ProducerID = pr.ID" +
                   " where pr.Alias = ?1 and pc.Alias = ?2 and pc.Depth = 0", nativeQuery = true)
    List<Categories> findAllByAliasProducerAndAliasCategory(String aliasProducer, String aliasCategory);

    List<Categories> findAllByDepth(int depth);
    Categories findByAlias(String alias);
    List<Categories> findAllByParentId(Integer parentId);

}
