package com.example.demo;

import com.example.demo.service.CodeGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookshelfApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void CodeGenerator_getCode() {
		String code = new CodeGenerator().getCode();
		assertTrue(code.length() == 3, "Code must be 3 characters");
	}

}
