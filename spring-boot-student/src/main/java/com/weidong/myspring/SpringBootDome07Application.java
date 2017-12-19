package com.weidong.myspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2  //Swagger注解配置
@MapperScan(basePackages = "com.weidong.myspring.mapper")
public class SpringBootDome07Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDome07Application.class, args);
	}
}
