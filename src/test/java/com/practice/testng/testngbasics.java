package com.practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasics {
	@BeforeSuite
	public void setup() {
		System.out.println("setup for chrome");
	}
	@BeforeTest
	public void launch_Browser()
	{
		System.out.println("Launch chrome browser");
	}
	

	@BeforeClass
	public void Enter_URL()
	{
		System.out.println("URL");
	}
	
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Testing google title");
	}
	
	@Test
	public void boogleTitleTest1()
	{
		System.out.println("Testing google title1");
	}
	@AfterMethod()
	public void logout()
	{
		System.out.println("Logout for app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("closing browser");
	}
	@AfterTest
	public void deleteAllcookies()
	{
		System.out.println("delete all cookies");
	}
	@AfterSuite
	public void generate_report()
	{
		System.out.println("generate report");
	}
	
	
}
