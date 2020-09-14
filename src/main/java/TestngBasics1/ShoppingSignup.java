package TestngBasics1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingSignup {

	WebDriver driver;
	
	//String itemName;
	
	
	
		public void launchBrowser() {
			
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
	}
	/*	//signup
		
		driver.findElement(By.id("signin2")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("bhavani.kore@gmail.com");
		
		//driver.findElement(By.id("sign-username")).sendKeys("k.bhavani6@gmail.com");
		driver.findElement(By.id("sign-password")).sendKeys("India@123");
		//driver.findElement(By.xpath("//button[@title='register']")).click();
		
		//driver.findElement(By.classname("Sign up")).click();

	}
*/
		//login
		
		public void login() {
			
		
			
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("loginusername")).sendKeys("k.bhavani6@gmail.com");
		
		driver.findElement(By.id("loginpassword")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		
	}
		
		public void addToCart() {
			
	//String itemName=driver.findElement(By.linkText("Samsung galaxy s6")).getText();
			
			driver.navigate().refresh();
	driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	
	/*Alert alert1=driver.switchTo().alert();
	
	String alertmsg1=driver.switchTo().alert().getText();
	
	System.out.println(alertmsg1);*/
	
	WebDriverWait wait = new WebDriverWait(driver,2);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated
			(By.xpath("//a[contains(text(),'Cart')]"))).click();
	
	
			
		}

     
        public static void main(String[] args) {

        ShoppingSignup s1= new ShoppingSignup();
        s1.launchBrowser();
        s1.login();
        s1.addToCart();
    
        }
}
        
        
