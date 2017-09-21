package com.zhang.spring.controller;

import com.zhang.spring.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DataRestController {

    @RequestMapping(value = "/getJSON", produces = "application/json;charset=UTF-8")
    public User getUserJSON(User user) {
        return new User(user.getId() + 1, user.getName() + "zhang");
    }

}
