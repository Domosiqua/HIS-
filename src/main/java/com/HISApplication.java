package com;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@MapperScan("com.mapper")
@ServletComponentScan
@EnableTransactionManagement
//@EnableCaching
//@EnableKnife4j
public class HISApplication {

	public static void main(String[] args) {
		SpringApplication.run(HISApplication.class, args);
	}

}
