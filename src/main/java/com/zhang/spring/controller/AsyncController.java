package com.zhang.spring.controller;

import com.zhang.spring.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @ResponseBody
    @RequestMapping("/defer")
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
