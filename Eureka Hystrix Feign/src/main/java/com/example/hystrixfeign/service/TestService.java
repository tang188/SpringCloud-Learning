package com.example.hystrixfeign.service;

import com.example.hystrixfeign.service.impl.TestServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = TestServiceHystrix.class)
public interface TestService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi();
}
