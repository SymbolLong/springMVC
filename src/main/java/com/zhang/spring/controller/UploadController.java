package com.zhang.spring.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/Users/zhangsl/Downloads/" + file.getOriginalFilename()), file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
        return "true";
    }
}