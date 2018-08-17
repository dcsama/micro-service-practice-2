package com.house.consumer.remote;

import com.house.consumer.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "consumer-hello",
        url = "http://localhost:8081",
        path = "/house",
        qualifier = "houseRemote",
        configuration = FeignConfiguration.class)
public interface IHouseRemote {

    @GetMapping("/hello")
    String hello();
}
