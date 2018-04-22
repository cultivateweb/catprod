package com.github.cultivateweb.catprod;

import com.github.cultivateweb.catprod.model.Category;
import com.github.cultivateweb.catprod.model.Producer;
import com.github.cultivateweb.catprod.model.Product;
import com.github.cultivateweb.catprod.repositories.CategoriesRepository;
import com.github.cultivateweb.catprod.repositories.ProducersRepository;
import com.github.cultivateweb.catprod.repositories.ProductsRepository;
import com.github.cultivateweb.catprod.repositories.entities.Categories;
import com.github.cultivateweb.catprod.repositories.entities.Producers;
import com.github.cultivateweb.catprod.repositories.entities.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MainService {

    private static final Logger LOG = LoggerFactory.getLogger(MainService.class);

    private final ProducersRepository producers;
    private final CategoriesRepository categories;
    private final ProductsRepository products;

    @Autowired
    public MainService(ProducersRepository producers, CategoriesRepository categories, ProductsRepository products) {
        this.producers = producers;
        this.categories = categories;
        this.products = products;
    }

    public List<Producer> producers() {
        return producers.findAll()
                        .stream()
                        .map(Producers::toProducer)
                        .collect(Collectors.toList());
    }

    public List<Category> categories() {
        return categories.findAllByDepth(0)
                         .stream()
                         .map(Categories::toCategory)
                         .collect(Collectors.toList());
    }

    public List<Category> categories(String aliasCategory) {
        LOG.info(aliasCategory);
        Categories parentCategory = categories.findByAlias(aliasCategory);
        LOG.info(parentCategory.toString());
        return categories.findAllByParentId( parentCategory.getId() )
                         .stream()
                         .map(Categories::toCategory)
                         .collect(Collectors.toList());
    }

    public List<Product> products(String aliasCategory) {
        Categories parentCategory = categories.findByAlias(aliasCategory);
        return products.findAllByCategoryId( parentCategory.getId() )
                       .stream()
                       .map(Products::toProduct)
                       .collect(Collectors.toList());
    }

    public Product product(String aliasProduct) {
        return products.findOneByAlias(aliasProduct).toProduct();
    }

    public Producer producer(String aliasProducer) {
        return producers.findOneByAlias(aliasProducer).toProducer();
    }

    public List<Category> producerCategories(String aliasProducer) {
        return categories.findAllByAliasProducer(aliasProducer)
                         .stream()
                         .map(Categories::toCategory)
                         .collect(Collectors.toList());
    }

    public List<Category> producerCategorySubcategories(String aliasProducer, String aliasCategory) {
        return categories.findAllByAliasProducerAndAliasCategory(aliasProducer, aliasCategory)
                .stream()
                .map(Categories::toCategory)
                .collect(Collectors.toList());
    }

    public List<Product> producerCategoryProducts(String aliasProducer, String aliasCategory) {
        return products.findAllByAliasProducerAndAliasCategory(aliasProducer, aliasCategory)
                       .stream()
                       .map(Products::toProduct)
                       .collect(Collectors.toList());
    }

}
