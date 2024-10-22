package com.vincent.dorisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.vincent.dorisdemo")
//@ComponentScan(basePackages = {"com.vincent.dorisdemo.*"})
@MapperScan("com.vincent.dorisdemo.mapper")
public class DorisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DorisDemoApplication.class, args);
	}

}
