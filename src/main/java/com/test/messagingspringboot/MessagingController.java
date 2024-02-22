package com.test.messagingspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {

    @Autowired
    private HelloProducer service;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        service.sendMessage("Olá, " + name);
        return "OK";
    }


}
