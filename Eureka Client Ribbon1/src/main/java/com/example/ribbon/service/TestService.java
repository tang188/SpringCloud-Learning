package com.example.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi", String.class);
    }
}
