package com.test.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.util.Calculate;

public class CalculateTest {

	

	@Test
	public void testAdd(){
		assertEquals(7, new Calculate().add(3, 4));
	}
	
	@Test
	public void testSubstract(){
		assertEquals(1, new Calculate().substract(5, 4));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(15, new Calculate().multiply(3, 5));
	}
	
	@Test
	public void testDivide(){
		assertEquals(2, new Calculate().divide(4, 2));
	}

}
