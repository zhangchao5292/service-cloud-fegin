package com.service.cloud.fegin;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

//configuration可以让你自定义配置信息来覆盖Feign的默认配置  比如配置日志输出
@Configuration
public class FeignConfiguration {
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
    @Bean
    public Retryer feginRetryer(){
        return new Retryer.Default(100,TimeUnit.SECONDS.toMillis(1L),5);
    }

}
