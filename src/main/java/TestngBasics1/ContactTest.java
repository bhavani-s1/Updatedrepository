package TestngBasics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.demoblaze.com/");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		 
		 driver.findElement(By.id("recipient-email")).sendKeys("k.bhavani6@gmail.com");
		 
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Bhavani");
		
		driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("message");
		
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmsg=driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
	}

}
