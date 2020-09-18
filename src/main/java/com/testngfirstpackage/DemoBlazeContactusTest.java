package com.testngfirstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoBlazeContactusTest {

	WebDriver driver;
	@Test
	public void contactUs() {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
    	
    	driver.findElement(By.id("recipient-email")).sendKeys("k.bhavani6@gmail.com");
    	
    	driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Bhavani");
    	
    	driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("message");
    	
    	driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver,2);
    	
    	wait.until(ExpectedConditions.alertIsPresent());
    	
    	   String alertmsg=driver.switchTo().alert().getText();
    	
    	   System.out.println(alertmsg);
    	driver.switchTo().alert().accept();

			//Alert alert=driver.switchTo().alert();
			
    }
	
	
}

