package com.test.util;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	/*
	 * @Test:将一个普通的方法修饰成为一个测试方法
	 * 	@Test(expected = XX.class)
	 * 	@Test(timeout = 毫秒)
	 * @BeforeClass：它会在所有的方法运行前被执行，static修饰
	 * @AfterClass：它会在所有的方法运行结束后被执行，static修饰
	 * @Before：会在每一个测试方法被运行前执行一次
	 * @After：会在每一个测试方法运行后被执行一次
	 * @Ignore:所修饰的测试方法会被测试运行期忽略
	 * @RunWith：可以更改测试运行器 org.junit.runner.Runner
	 */

	@Test(expected = ArithmeticException.class)
	public void testDivide(){
		assertEquals(2, new Calculate().divide(4, 0));
	}
	
	@Ignore("...")
	@Test(timeout = 100)
	public void testWhile(){
		while(true)
			System.out.println("testWhile");
	}
}
