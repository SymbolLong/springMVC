package com.zhang.spring.config;

import com.zhang.spring.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdviceController {

    @RequestMapping(value = "/advice")
    public String getException(@ModelAttribute("msg") String msg, User user){
        throw new IllegalArgumentException("非常抱歉，参数有误；来自ModelAttribute："+msg);
    }
}
