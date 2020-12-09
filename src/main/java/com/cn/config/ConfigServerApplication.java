package com.cn.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {

		System.out.println("第一次提交");
		System.out.println("第二次提交");
		
		System.out.println("第八次次提交");
		
		
		
		

		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

