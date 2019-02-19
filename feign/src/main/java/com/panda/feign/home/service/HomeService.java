package com.panda.feign.home.service;

import com.panda.feign.home.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLIENT")
public interface HomeService {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    User userInfo(@RequestParam("name") String name, @RequestParam("age")Integer age);
}
