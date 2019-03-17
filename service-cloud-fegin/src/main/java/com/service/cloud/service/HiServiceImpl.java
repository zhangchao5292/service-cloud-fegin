package com.service.cloud.service;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class HiServiceImpl implements IHiService{
    @Resource
    private IHouseRemoteClient iHouseRemoteClient;

    public String sayHi(){
        return iHouseRemoteClient.hosueInfo(100L);
    }
}
