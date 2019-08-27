package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: tangzhihong
 * @Date: 2019/8/27 14:23
 */
@FeignClient(value = "eureka-client")
public interface TestInterface {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hiFromClient();
}
