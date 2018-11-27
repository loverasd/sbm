package com.example.demo.dao;

import com.example.demo.model.MongoTest;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * @program: chenpan
 * @description:
 * @author: chenp
 * @create: 2018-11-13 15:22
 **/
@Component
public class MongoTestDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * 创建对象
     */
    public void saveTest(MongoTest mongoTest){
        mongoTemplate.save(mongoTest);
    }
    /**
     * 根据用户名查询对象
     */
    public MongoTest findTestByName(String name){
        Query query = new Query(Criteria.where("name").is(name));
        MongoTest mongoTest = mongoTemplate.findOne(query,MongoTest.class);
        return mongoTest;
    }

    /**
     *
     * @param mongoTest
     */
    public void updateTest(MongoTest mongoTest){
        Query query = new Query(Criteria.where("id").is(mongoTest.getId()));
        Update update = new Update().set("age",mongoTest.getAge())
                .set("name",mongoTest.getName());
        //更新查询返回结果集的第一条
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, MongoTest.class);
        //更新查询返回结果集的所有
        mongoTemplate.updateMulti(query,update,MongoTest.class);

    }
    public void deleteTestById(Integer id){
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult remove = mongoTemplate.remove(query, MongoTest.class);
    }
}