package com.service.cloud.fegin;
import com.google.common.collect.Maps;
import com.service.cloud.service.IHouseRemoteClient;
import org.springframework.stereotype.Component;

import java.util.Map;

//@FeignClient里的fallback可以让你的接口在熔断处理时，返回默认的值给调用方，这个一般有2种方式：
// 实现Feign的接口，实现所有的默认方法
@Component
public class HouseRemoteClientHystrix implements IHouseRemoteClient {

    @Override
    public String hosueInfo(Long houseId) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("msg","服务繁忙，请稍后");
        return map.toString();
    }
}
