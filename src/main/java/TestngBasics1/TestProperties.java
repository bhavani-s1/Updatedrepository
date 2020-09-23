package TestngBasics1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class TestProperties {

		WebDriver driver;
		
		Properties prop= new Properties();
		@Test(priority=1)
		
			public void launchBrowser() throws IOException {
				
			
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			
			 
 FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\Newdemo\\src\\main\\java\\TestngBasics1\\config.properties");
				prop.load(ip);
				
			
		//driver.get("https://www.demoblaze.com/");
			
	driver.get(prop.getProperty("url"));
			
	
			driver.manage().window().maximize();
		}
		//signup
		
		@Test(priority=2)
		
		public void signupTest() {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//locator from properties file
			//driver.findElement(By.xpath("//a[@id='signin2']")).click();
			
			driver.findElement(By.xpath("//a[@id='signin2']")).click();
			
			//driver.findElement(By.cssSelector("#login2")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(prop.getProperty("emailid"));
			
			//locator from properties file
			driver.findElement(By.xpath(prop.getProperty("usernamexpath"))).sendKeys(prop.getProperty("emailid"));
			
			//driver.findElement(By.id("sign-username")).sendKeys("k.bhavani6@gmail.com");
			driver.findElement(By.id(prop.getProperty("pwdxpath"))).sendKeys(prop.getProperty("pwddemo"));
			
			//driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
			
			driver.findElement(By.xpath(prop.getProperty("signinbutton"))).click();
			
			//driver.findElement(By.classname("Sign up")).click();

		}
	
	
		//login
			
		@Test(priority=3)
			
		public void login() throws InterruptedException {
				
				
			//driver.findElement(By.xpath("//a[@id='login2']")).click();
			
			driver.findElement(By.xpath(prop.getProperty("Loginbutton"))).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.id("loginusername")).sendKeys(prop.getProperty("emailid"));
			 
			 driver.findElement(By.id(prop.getProperty("username"))).sendKeys(prop.getProperty("emailid"));
			
			 //driver.findElement(By.id("loginpassword")).sendKeys(prop.getProperty("pwddemo"));
			 
			 driver.findElement(By.id(prop.getProperty("loginpwd"))).sendKeys(prop.getProperty("pwddemo"));
			
			driver.findElement(By.xpath(prop.getProperty("loginclick1"))).click();
			
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
	    	  driver.findElement(By.id("name")).sendKeys(prop.getProperty("name"));
	    	  driver.findElement(By.id("country")).sendKeys("India");
	    	  driver.findElement(By.id("city")).sendKeys("Bangalore");
	    	  driver.findElement(By.id("card")).sendKeys("45362527288196");
	    	  driver.findElement(By.id("month")).sendKeys("September");
	    	  driver.findElement(By.id("year")).sendKeys("2020");
	    	  driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
	    	  
	    	  Thread.sleep(2000);

	      }
				
			
	     
	    @Test(priority=4)
			
			public void contactUs() {
				
	    	driver.navigate().refresh();
	    	//driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	    	 driver.findElement(By.xpath(prop.getProperty("contactlinkclick"))).click();
	    	
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
				
				@Test(priority=6) 
				
				public void closeBrowser()
				{
					
					driver.close();
				}
				
				
			}
			
	     


	        
	        


