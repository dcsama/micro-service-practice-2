package com.house.consumer.controller;

import com.house.consumer.remote.IHouseRemote;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource(name = "houseRemote")
    private IHouseRemote houseRemote;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){
        return this.houseRemote.hello();
    }

    public String helloFallback(){
        return "hello fall back.";
    }
}
