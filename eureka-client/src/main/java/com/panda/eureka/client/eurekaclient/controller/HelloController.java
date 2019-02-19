package com.panda.eureka.client.eurekaclient.controller;

import com.panda.eureka.client.eurekaclient.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jamie
 * @ClassName: HelloController
 * @Description:
 * @data 2019-02-18 17:07
 **/
@RestController
public class HelloController {

    @RequestMapping("/home")
    public String hello(){
        return "this is my home123!";
    }


    @RequestMapping("/userInfo")
    public User userInfo(@RequestParam("name") String name, @RequestParam("age")Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
