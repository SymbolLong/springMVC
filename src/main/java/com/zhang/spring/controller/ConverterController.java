package com.zhang.spring.controller;

import com.zhang.spring.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {

    @ResponseBody
    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    public User converter(@RequestBody User user){
        return user;
    }
}
