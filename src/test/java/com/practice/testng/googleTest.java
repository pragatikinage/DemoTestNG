package com.practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class googleTest {
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
	

@Test(groups = "start")
public void checklogo()
{
	WebElement element=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	boolean b=element.isDisplayed();
	Assert.assertTrue(b);
	System.out.println("Passed");
}
@Test(groups = "start")
public void testsearch()
{
	WebElement e=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

	e.sendKeys("mobile");
	e.sendKeys(Keys.ENTER);
}
@Test(groups = "end")
public void test1()
{
	System.out.println("running test1");
}

@Test(groups = "end")
public void test2()
{
	System.out.println("Running test2");
}
@AfterMethod
public void closebrowser() {
	driver.close();
}
@AfterSuite
public void generate_report()
{
	System.out.println("generate report");
}


	

}
