package com.house.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(){
        return this.restTemplate.getForObject("http://localhost:8081/house/hello", String.class);
    }
}
