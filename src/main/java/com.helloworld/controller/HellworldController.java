package com.helloworld.controller;

import com.helloworld.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 11023 on 2018/3/4.
 */
@RestController
public class HellworldController {

    @Autowired
    private HelloworldService helloworldService;

    @RequestMapping("/helloWorld")
    public String getInfo(){
        return helloworldService.getHelloworld();
    }
}
