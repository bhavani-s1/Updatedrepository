package TestngBasics1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class helperTest {

	
	
	public void contactUs(WebDriver driver) throws IOException {
		
		FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\Newdemo\\src\\main\\java\\TestngBasics1\\config.properties");
		Properties prop= new Properties();
		prop.load(ip);
    	driver.navigate().refresh();
    	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
    	driver.findElement(By.id("recipient-email")).sendKeys(prop.getProperty("emailid"));
    	driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(prop.getProperty("name"));
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
