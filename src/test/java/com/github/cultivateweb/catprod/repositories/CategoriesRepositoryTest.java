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
public class CategoriesRepositoryTest {

    private static final Logger LOG = LoggerFactory.getLogger(CategoriesRepositoryTest.class);

    @Autowired
    private CategoriesRepository categories;

    @Test
    public void findAllByAliasProducer() {
        LOG.info("------------- findAllByAliasProducer -------------");
        LOG.info(categories.findAllByAliasProducer("samsung").toString());
        LOG.info("------------- ---------------------- -------------");
    }

    @Test
    public void findAllByAliasProducerAndAliasCategory() {
        LOG.info("------------- findAllByAliasProducerAndAliasCategory -------------");
        LOG.info(categories.findAllByAliasProducerAndAliasCategory(
            "samsung",
            "krupnaya-bytovaya-tekhnika").toString());
        LOG.info("------------- -------------------------------------- -------------");
    }

}