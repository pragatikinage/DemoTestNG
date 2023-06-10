package com.practice.testng;

import org.testng.annotations.Test;

public class Invocationcount {
@Test(invocationCount = 10)
public void cal_sum()
{
	int a=10,b=11;
	int c=a+b;
	System.out.println(c);
	
}
}
