package com.example.demo.config.db.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @program: chenpan
 * @description:
 * @author: chenp
 * @create: 2018-11-13 16:33
 **/
@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.model.repository.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE)
public class PrimaryMongoConfig {
    protected static final  String MONGO_TEMPLATE = "primaryMongoTemplate";
}