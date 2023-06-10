package com.practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testngparameters {
	static WebDriver driver;

	@Test	
	@Parameters({"uname","pwd"})
	public void login(String uname, String pwd)
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement e=driver.findElement(By.xpath("//a[@class='_yb_chndi']"));
		e.click();
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(uname);
		driver.findElement(By.xpath("//div[@class='button-container']//child::input")).click();
	}
}
