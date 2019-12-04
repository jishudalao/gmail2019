package com.example.gmail.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.gmail.service.mapper")
public class GmailManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmailManageServiceApplication.class, args);
	}

}
