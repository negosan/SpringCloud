package com.neusoft.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NeusoftHtRibbonAndFeignProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeusoftHtRibbonAndFeignProjectApplication.class, args);
	}

}
