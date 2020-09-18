package com.testngfirstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlazeLoginTest1 {

	WebDriver driver;

	
	@Test
	
	public void login() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/");
	
	driver.manage().window().maximize();

		//login
	
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginusername")).sendKeys("k.bhavani6@gmail.com");
		
		driver.findElement(By.id("loginpassword")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		Thread.sleep(2000);
	}
	
	
}

	

