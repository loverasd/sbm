package com.example.demo.config.db.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @program: chenpan
 * @description:
 * @author: chenp
 * @create: 2018-11-13 16:41
 **/
@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.model.repository.secondary",
    mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {
    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";

}