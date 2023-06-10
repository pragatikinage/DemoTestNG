package com.practice.testng;

import org.testng.annotations.Test;

public class Exceptiontimeouttest {

	@Test(timeOut = 2000,expectedExceptions=NumberFormatException.class)
	public void test()
	{ String A="100A";
	Integer.parseInt(A);
	System.out.println("Hello");
		
	}
	
//	public void test1() {
//		int i = 1;
//		while (i == 1) {
//			System.out.println(i);
//		}
	}

