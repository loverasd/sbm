package com.example.demo.controller;

import com.example.demo.dao.MongoTestDao;
import com.example.demo.model.MongoTest;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: chenpan
 * @description:
 * @author: chenp
 * @create: 2018-11-13 15:41
 **/
@RestController("/chenpan")
public class MongoTestController {
    @Autowired
    private MongoTestDao mtdao;


    @ApiOperation(value = "这是第一个测试",notes = "")
    @GetMapping(value = "/test1")
    public String saveTest(String id,String value) throws Exception{
        MongoTest mongoTest = new MongoTest();
        mongoTest.setId(1);
        mongoTest.setAge(1000);
        mongoTest.setName("li bai");
        mtdao.saveTest(mongoTest);
        System.out.println("save success");
        return "ok"+id+":"+value;
    }

    @ApiOperation(value = "this is 第二个测试")
    @PostMapping(value = "/test2")
    public String saveTest1(){
        return "test2,窗前明月光";
    }



}