package com.practice.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class googleTitleTest {

	static WebDriver driver;

	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		
	}
	@BeforeMethod
	public void openURL()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
		
	@Test
	public void testtitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "google","Title is not matched");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
