package com.zhang.spring.controller;

import com.zhang.spring.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String index(HttpServletRequest request) {
        return "URL:" + request.getRequestURL() + "can access.";
    }

    @ResponseBody
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public String pathVar(@PathVariable String str, HttpServletRequest request) {
        return "URL:" + request.getRequestURL() + " can access, str = " + str;
    }

    @ResponseBody
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public String requestParam(Long id, HttpServletRequest request) {
        return "URL:" + request.getRequestURL() + " can access, id= " + id;
    }

    @ResponseBody
    @RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
    public String user(User user, HttpServletRequest request) {
        return "user:" + request.getRequestURL() + " can access , user id = " + user.getId() + ";user name= " + user.getName();
    }

    @ResponseBody
    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=UTF-8")
    public String remove(HttpServletRequest request) {
        return "URL:" + request.getRequestURL() + "can access";
    }

}
