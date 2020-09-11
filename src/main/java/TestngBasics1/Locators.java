package TestngBasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//Locators
		//1.Id
		
		driver.findElement(By.id("ap_email")).sendKeys("bhavani.kore@amazon.com");
		driver.findElement(By.id("continue")).click();
		
		
	//2.Name
		
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.name("username")).sendKeys("k.bhavani@yahoo.com");
		
				
		
		
		
		
	}

}
