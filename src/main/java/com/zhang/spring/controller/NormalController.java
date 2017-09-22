package com.zhang.spring.controller;

import com.zhang.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

    @Autowired
    private TestService testService;

    @RequestMapping("/normal")
    public String testpage(Model model){
        model.addAttribute("msg", testService.sayHello());
        return "page";
    }
}
