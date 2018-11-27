package com.example.demo.jdk8_time;

import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * @program: chenpan
 * @description: 日期距离
 * @author: chenp
 * @create: 2018-11-02 11:21
 **/
@Service
public class TestInstant {
    public String getDuration(){
        Instant now = Instant.now();
        Thread.currentThread().getName();
        return null;
    }
}