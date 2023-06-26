package com;

import com.domain.CheckRequest;
import com.service.CheckRequestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CheckRequestService service;
	@Test
	void contextLoads() {
		Collection<CheckRequest> list = service.list();
		System.out.println(list);
	}

}
