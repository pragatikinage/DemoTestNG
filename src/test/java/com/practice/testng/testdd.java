package com.practice.testng;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.practice.utility.Utility;

public class testdd {
	static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
	 driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	@DataProvider(name="Excel_Data")
	public Iterator<Object[]> get_data()
	{
		ArrayList<Object[]> list=null;
		try
		{
			list=Utility.get_data_excel();
		}
		catch(IOException e)
		{
			
		}
		return list.iterator();
	}
	@Test(dataProvider="Excel_Data")
	public void login(String uname,String pwd)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
