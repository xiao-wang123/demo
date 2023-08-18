package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// 开启spring组件扫描和springboot自动配置
/*
相当于
@Configuration
@ComponentScan
@EnableAutoConfiguration
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
// 是启动引导类、还是配置类
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
