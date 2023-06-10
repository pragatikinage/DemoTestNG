package com.practice.testng;

import org.testng.annotations.Test;

public class TestNGfeatures {
	@Test
	public void login()
	{
		System.out.println("Login");
		int i=9/0;
	}
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("homepage");
	}

}
