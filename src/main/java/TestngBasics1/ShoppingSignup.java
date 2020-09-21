package TestngBasics1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingSignup {

	WebDriver driver;
	
	@Test(priority=1)
	
		public void launchBrowser() {
			
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
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
		
	@Test(priority=2)
		
	public void login() throws InterruptedException {
			
			
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginusername")).sendKeys("k.bhavani6@gmail.com");
		
		driver.findElement(By.id("loginpassword")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		Thread.sleep(2000);
	}
		@Test(priority=4)
		
		public void addToCart() 
		
		{
			
			driver.navigate().refresh();
			driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
			WebDriverWait wait = new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cart')]"))).click();

	
			
		}
		
		
      @Test(priority=5)
		
      public void placeOrder() throws InterruptedException {
			
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	  driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(7) div.row div.col-lg-1 > button.btn.btn-success:nth-child(3)")).click();
    	  driver.findElement(By.id("name")).sendKeys("Bhavani");
    	  driver.findElement(By.id("country")).sendKeys("India");
    	  driver.findElement(By.id("city")).sendKeys("Bangalore");
    	  driver.findElement(By.id("card")).sendKeys("45362527288196");
    	  driver.findElement(By.id("month")).sendKeys("September");
    	  driver.findElement(By.id("year")).sendKeys("2020");
    	  driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
    	  
    	  Thread.sleep(2000);

			
			
		}
     
    @Test(priority=3)
		
		public void contactUs() {
			
    	driver.navigate().refresh();
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
			
			@Test(priority=6) 
			
			public void closeBrowser()
			{
				
				driver.close();
			}
			
			
		}
		
     


        
        
