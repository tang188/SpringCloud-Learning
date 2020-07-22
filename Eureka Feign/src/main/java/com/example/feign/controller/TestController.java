package com.example.feign.controller;

import com.example.feign.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: tangzhihong
 * @Date: 2019/8/27 14:29
 */
@RestController
public class TestController {

    @Autowired
    TestInterface testInterface;

    @RequestMapping(value = "/hi")
    public String sayHi(){
        return testInterface.hiFromClient();
    }
}
