package com.example.demo.model.repository.primary;

import com.example.demo.model.repository.primary.PrimaryMongoObject;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrimaryRespository extends MongoRepository<PrimaryMongoObject,String> {
/**
 * @program: chenpan
 *
 * @description:
 *
 * @author: chenp
 *
 * @create: 2018-11-13 17:40
 **/

}
