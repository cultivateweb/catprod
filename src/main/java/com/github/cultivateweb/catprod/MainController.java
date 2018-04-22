package com.github.cultivateweb.catprod;

import com.github.cultivateweb.catprod.model.Category;
import com.github.cultivateweb.catprod.model.Producer;
import com.github.cultivateweb.catprod.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public @RestController class MainController {

    private final MainService service;

    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @RequestMapping(value = "/producers", method = RequestMethod.GET)
    public List<Producer> producers() {
        return service.producers();
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> categories() {
        return service.categories();
    }

    @RequestMapping(value = "/categories/{aliasCategory}/subcategories", method = RequestMethod.GET)
    public List<Category> categories(@PathVariable("aliasCategory") String alias) {
        return service.categories(alias);
    }

    @RequestMapping(value = "/categories/{aliasCategory}/products", method = RequestMethod.GET)
    public List<Product> productsByAliasCategory(@PathVariable("aliasCategory") String alias) {
        return service.products(alias);
    }

    @RequestMapping(value = "/products/{aliasProduct}", method = RequestMethod.GET)
    public Product products(@PathVariable("aliasProduct") String alias) {
        return service.product(alias);
    }

    @RequestMapping(value = "/producers/{aliasProducer}", method = RequestMethod.GET)
    public Producer producers(@PathVariable("aliasProducer") String alias) {
        return service.producer(alias);
    }

    @RequestMapping(value = "/producers/{aliasProducer}/categories", method = RequestMethod.GET)
    public List<Category> categoriesByAliasProducer(@PathVariable("aliasProducer") String alias) {
        return service.producerCategories(alias);
    }

    @RequestMapping(value = "/producers/{aliasProducer}/categories/{aliasCategory}/subcategories", method = RequestMethod.GET)
    public List<Category> producerCategorySubategories(@PathVariable("aliasProducer") String aliasProducer,
                                                       @PathVariable("aliasCategory") String aliasCategory) {
        return service.producerCategorySubcategories(aliasProducer, aliasCategory);
    }

    @RequestMapping(value = "/producers/{aliasProducer}/categories/{aliasCategory}/products", method = RequestMethod.GET)
    public List<Product> producerCategoryProducts(@PathVariable("aliasProducer") String aliasProducer,
                                                  @PathVariable("aliasCategory") String aliasCategory) {
        return service.producerCategoryProducts(aliasProducer, aliasCategory);
    }

}
