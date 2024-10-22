package com.vincent.dorisdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@Disabled("暂时忽略这个测试")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DorisDemoApplicationTests {
	@Test
	void contextLoads() {
		// 测试内容
	}
}
