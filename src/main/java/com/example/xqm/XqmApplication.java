package com.example.xqm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.xqm.mapper")
@ComponentScan("com.example.xqm.service") 
public class XqmApplication {

	public static void main(String[] args) {
		SpringApplication.run(XqmApplication.class, args);
	}

}
