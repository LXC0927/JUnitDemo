package com.test.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {
	/*
     * 1.Failure一般由单元测试使用的断言方法判断失败所引起的，这就表示测试点发现了问题，
     * 就是说程序输出的结果和我们预期不一样。
     * 2.error是由代码异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中
     * 的一个隐藏的BUG
     * 3.测试用例不是用来证明对的，而是用来证明没有错。
     */
	@Test
	public void testAdd(){
		assertEquals(6, new Calculate().add(3, 4));
	}
	
	@Test
	public void testDivide(){
		assertEquals(2, new Calculate().divide(4, 0));
	}
}
