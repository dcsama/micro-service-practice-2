package com.house.consumer.remote;

import org.springframework.stereotype.Component;

@Component
public class HouseRemoteFallback implements IHouseRemote {
    @Override
    public String hello() {
        return "hello is fall back.";
    }
}
