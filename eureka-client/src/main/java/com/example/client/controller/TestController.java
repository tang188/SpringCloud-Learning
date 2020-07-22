package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi() throws Exception {
        label1:
        try {
            System.out.println("try body !");
            break label1;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("finally body! ");
        }
        return "hi,this is client, my port is " + port;
    }
}
