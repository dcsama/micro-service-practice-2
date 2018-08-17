package com.house.consumer.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    /**
     * 日志配置
     */
    @Bean
    Logger.Level getFeignLoggerLevel(){
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options getFeignOptions(){
        return new Request.Options(1000, 5000);
    }
}
