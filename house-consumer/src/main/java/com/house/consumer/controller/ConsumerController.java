package com.house.consumer.controller;

import com.house.consumer.remote.IHouseRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource(name = "houseRemote")
    private IHouseRemote houseRemote;

    @GetMapping("/hello")
    public String hello(){
        return this.houseRemote.hello();
    }
}
