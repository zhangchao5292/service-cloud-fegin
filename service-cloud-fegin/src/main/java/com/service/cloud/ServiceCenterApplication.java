package com.service.cloud;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 项目启动类
 * 
 * @author liuqs
 *
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ServiceCenterApplication extends SpringBootServletInitializer {
	private static Log logger = LogFactory.getLog(ServiceCenterApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceCenterApplication.class, args);

		logger.info("The Service Center config STARTED !");
	}

}