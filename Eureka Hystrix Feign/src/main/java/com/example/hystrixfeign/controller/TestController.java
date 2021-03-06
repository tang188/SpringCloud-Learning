package com.example.hystrixfeign.controller;

import com.example.hystrixfeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/hi")
    public String sayHi(){
        return testService.hi();
    }
}
