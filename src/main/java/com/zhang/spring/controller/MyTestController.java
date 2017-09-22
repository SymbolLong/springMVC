package com.zhang.spring.controller;

import com.zhang.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/testRest",produces = "text/plain;charset=UTF-8")
    public String testRest(){
        return testService.sayHello();
    }
}
