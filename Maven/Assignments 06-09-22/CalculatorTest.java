package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAddition()
	{
		Calculator cal = new Calculator();
		assertEquals(10, cal.addition(5, 5),
				"This test method is to test additon of two int values");
	}
	
	@Test
	void testMul()
	{
		Calculator cal = new Calculator();
		assertEquals(10, cal.multiplication(5, 2),
				"This test method is to test multiplication of two int values");
	}
	
	
	@Test
	void testSubstraction()
	{
		Calculator cal = new Calculator();
		assertEquals(2, cal.substraction(8, 10),
				"This test method is to test substraction of two int values");
	}
	
	@Test
	void testDivision()
	{
		Calculator cal = new Calculator();
		assertEquals(5, cal.division(25, 5),
				"This test method is to test division of two int values");
	}
	
	@Test
	void testFactorial()
	{
		Calculator cal = new Calculator();
		assertEquals(120, cal.factorial(5),
				"This test method is to test factorial of int value");
	}
}
