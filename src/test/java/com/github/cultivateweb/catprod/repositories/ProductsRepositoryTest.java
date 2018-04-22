package com.github.cultivateweb.catprod.repositories;

import com.github.cultivateweb.catprod.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@Transactional
public class ProductsRepositoryTest {


    private static final Logger LOG = LoggerFactory.getLogger(ProductsRepositoryTest.class);

    @Autowired
    private ProductsRepository products;

    @Test
    public void findAllByAliasProducerAndAliasCategory() {
        LOG.info("------------- findAllByAliasProducerAndAliasCategory -------------");
        LOG.info(products.findAllByAliasProducerAndAliasCategory(
                "samsung",
                "kholodilniki").toString());
        LOG.info("------------- -------------------------------------- -------------");
    }
}