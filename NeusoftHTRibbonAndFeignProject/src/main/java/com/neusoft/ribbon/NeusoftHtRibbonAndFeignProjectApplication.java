package com.neusoft.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
@EnableDiscoveryClient//启用注册客户端（通用）
//@EnableEurekaClient//启用注册客户端
@EnableHystrix//启用保护
@EnableHystrixDashboard//启用Hystrix仪表盘
public class NeusoftHtRibbonAndFeignProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeusoftHtRibbonAndFeignProjectApplication.class, args);
	
	}
	@Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }



}
