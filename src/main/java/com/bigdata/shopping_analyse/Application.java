package com.bigdata.shopping_analyse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;

//创建 Application.java，其注解 @SpringBootApplication 
//表示这是一个SpringBoot应用，运行其主方法就会启动tomcat,默认端口是8080
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//这里是清除springboot启动图标以及版本信息
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
		// 下面是正常启动
		// SpringApplication.run(Application.class, args);
	}
}
