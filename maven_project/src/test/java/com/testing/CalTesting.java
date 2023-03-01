package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTesting {

	@Test
public void testAdd() {
		//calculator class object for testing
		Calculator cal = new Calculator();
		//To compare expected and actual output
		assertEquals(40, cal.addition(10, 30));
		          //Expected         //Actual 
	}
	@Test //Test Annotation
	void testMul() {
		Calculator cal = new Calculator();
		assertEquals(300, cal.multiplication(10, 30));	
	}
	@Test
	void testFactorial() {
		Calculator cal = new Calculator();
		assertEquals(120, cal.factorial(5));
	}
}

