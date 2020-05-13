package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import tk.mybatis.spring.annotation.MapperScan;

@EnableScheduling
@EnableWebSocket
@MapperScan(basePackages = "com.moon.dao")
@SpringBootApplication
public class Start {
	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}
}
