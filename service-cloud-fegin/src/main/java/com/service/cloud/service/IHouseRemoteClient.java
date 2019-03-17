package com.service.cloud.service;

import com.service.cloud.fegin.FeignConfiguration;
import com.service.cloud.fegin.HouseRemoteClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//value表示你要消费哪个服务的接口，path就是统一的前缀
@FeignClient(value = "service-center", configuration = FeignConfiguration.class,fallback = HouseRemoteClientHystrix.class)
public interface IHouseRemoteClient {
    @RequestMapping(value = "/servicecenter/config",method=RequestMethod.GET)
     String hosueInfo(@PathVariable("token")Long token);
}
