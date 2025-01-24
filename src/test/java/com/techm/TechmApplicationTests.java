package com.techm;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.techm.controller.MathService;

@SpringBootTest
class TechmApplicationTests {

	@Test
	void contextLoads() {
	}
	
	 @Test
	    public void testAdd() {
	        // Arrange
	        MathService mathService = new MathService();
	        int a = 5;
	        int b = 3;

	        // Act
	        int result = mathService.add(a, b);

	        // Assert
	        assertEquals(8, result);  // 5 + 3 = 8
	    }

}
