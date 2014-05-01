package com.mycompany.mavenproject1;
import com.mycompany.mavenproject1.Calculator;
import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	Calculator calc = new Calculator();
	@Test
	public void testDiv() 
	{
		
		int res = calc.funct(10, 5, '/');
		assertEquals(2, res);
	}

	@Test
	public void testMult() 
	{
		int res = calc.funct(10, 5, '*');
		assertEquals(50, res);
	}
	@Test
	public void testPlus() 
	{
		int res = calc.funct(10, 5, '+');
		assertEquals(15, res);
	}
	@Test
	public void testMinus() 
	{
		int res = calc.funct(10, 5, '-');
		assertEquals(5, res);
	}
	@Test (expected = ArithmeticException.class)
	public void testDivZeroc() 
	{
		calc.funct(10, 0, '/');
		
	}
	@Test	(expected = IllegalArgumentException.class)
	public void testAriphExc() 
	{
		calc.funct(10, 5, 'K');
		
	}
}
