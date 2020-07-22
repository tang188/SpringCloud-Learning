package com.example.hystrixfeign.service.impl;

import com.example.hystrixfeign.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceHystrix implements TestService {
    @Override
    public String hi() {
        return "sorry, this is feign hystrix";
    }
}
