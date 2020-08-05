package com.boom.kaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boom.kaka.dao")
public class KakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakaApplication.class, args);
	}

}
