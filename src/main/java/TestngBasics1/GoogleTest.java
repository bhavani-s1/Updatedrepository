package TestngBasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
   
	WebDriver driver;
	 String baseurl;
	 String driverpath;
	
	 @BeforeClass
	 
	public void launchbrowser() {
		
//baseurl="https://www.google.com";
		 
		 baseurl="http://demo.guru99.com/test/login.html";
		 
      driverpath="C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe";
      
      System.out.println("before class annotation");
	
		
	}
	
	 @BeforeMethod
	 
	 public void login() {
		 
		 System.setProperty("webdriver.chrome.driver",driverpath);
			
			driver=new ChromeDriver();
			
		 driver.get(baseurl);
		 
		 driver.findElement(By.id("email")).sendKeys("bhavani.kore@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("Asaheb@123");
		 driver.findElement(By.id("SubmitLogin")).click();
      System.out.println("before Method Annotation");		 

	 }
	 
	 //testcase
	@Test
	
	public void homepageTest()
	{
		
		//System.out.println("launching chrome browser");
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		driver=new ChromeDriver();
		
		driver.get(baseurl);
		
		String Expectedtitle="Login Page";
		String Actualtitle=driver.getTitle();
		
		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Actualtitle);
		
		}
	
	@AfterMethod
 
 public void closebrowser() {
	 
	 driver.close();
	 System.out.println("AfterMethod Annotation");
 }

}


