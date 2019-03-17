package com.service.cloud.fegin;

import com.service.cloud.service.IHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RestController
public class TestController {
    @Autowired
    private IHiService hiService;
//    @Test
    @GetMapping("/mytest")
    public void getInfo(){
        String s = hiService.sayHi();
        System.out.println("get configserver info:"+s);
    }
}
