package com.panda.feign.home.controller;

import com.panda.feign.home.domain.User;
import com.panda.feign.home.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jamie
 * @ClassName: HomeController
 * @Description:
 * @data 2019-02-18 17:33
 **/
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return homeService.hello();
    }

    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String userInfo(){
        return homeService.userInfo("jamie",20).toString();
    }

}
