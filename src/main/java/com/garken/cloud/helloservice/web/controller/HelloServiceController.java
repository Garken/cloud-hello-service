package com.garken.cloud.helloservice.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P0007221 on 2018/11/14.
 */
@RestController
@RequestMapping("/rest/hello/service")
public class HelloServiceController {

    @GetMapping("/replyHello")
    public String replyHello() {
        return "Hello World ^_^";
    }

}
