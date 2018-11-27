package com.example.demo;

import com.example.demo.model.MongoTest;
import com.example.demo.model.repository.primary.PrimaryRespository;
import com.example.demo.model.repository.primary.PrimaryMongoObject;
import com.example.demo.model.repository.secondary.SecondaryMongoObject;
import com.example.demo.model.repository.secondary.SecondaryRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {
//    @Autowired
//    private MongoTemplate mongoTemplate;
    @Autowired
    private PrimaryRespository primaryRespository;
    @Autowired
    private SecondaryRespository secondaryRespository;




    @Test
    public void Test(){
        System.out.println("测试");
        primaryRespository.save(new PrimaryMongoObject(null,"第一个库的对象"));
        System.out.println("primary start-----------------");
        List<PrimaryMongoObject> all = this.primaryRespository.findAll();
        all.stream().forEach(s-> System.out.println(s));

        System.out.println("primary end---------");

        SecondaryMongoObject secondaryMongoObject = new SecondaryMongoObject();
        secondaryMongoObject.setId("test_b2");
        secondaryMongoObject.setValue("this is test1 and it must be success 哈哈哈");
        secondaryRespository.save(secondaryMongoObject);
        System.out.println("save ok ");
        List<SecondaryMongoObject> all1 = this.secondaryRespository.findAll();
        all1.stream().forEach(s-> System.out.println(s));


    }

}
