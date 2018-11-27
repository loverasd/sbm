package com.example.demo.controller.swaggerTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: chenpan
 * @description: swagger test
 * @author: chenp
 * @create: 2018-11-15 13:54
 **/
@RestController("/swagger")
public class SwaggerTest {
    @RequestMapping(value = "/test1",method = {RequestMethod.POST})
    public String test1(){

        return "li bai";
    }
}