package TestngBasics1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myTour {

		static WebDriver driver;
		
		Properties prop= new Properties();
		@Test(priority=1)
		public void launchBrowser() throws IOException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
			
			

			//create object of fileinputstream and give the path of properties file
			
			FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\Newdemo\\src\\main\\java\\TestngBasics1\\config.properties");
			prop.load(ip);
			
			 driver= new ChromeDriver();
			
			//driver.get("https://www.ixigo.com");
			 
			 driver.get(prop.getProperty("url"));
			
			driver.manage().window().maximize();
			
		}

		@Test(priority=2)
		
		public void login1() throws InterruptedException
		{
		driver.findElement(By.xpath("//span[@class='user-login ixi-icon-user']")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='google-login']")).click();
				
		   
		String parent=driver.getWindowHandle();
		   Set<String>s=driver.getWindowHandles();
		   Iterator<String> I1= s.iterator();
		   while(I1.hasNext())
		   {

		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   driver.switchTo().window(child_window);

		   System.out.println(driver.switchTo().window(child_window).getTitle());
		   
//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("k.bhavani6@gmail.com");
		   
		   
		   driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(prop.getProperty("emailid"));
		  
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

		   //driver.findElement(By.xpath("//div[@id='profileIdentifier']")).click();
		   Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Asaheb@123");
		   
		   
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		   
		   
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		   Thread.sleep(2000);
		
		   //driver.close();
		   
		   //switch to the parent window
		   driver.switchTo().window(parent);
	}
		      
		   
		   
		   }
		   
		}
		@Test(priority=3)
		public void booking() {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7702101526");
			
			//driver.findElement(By.xpath("//div[@class='continue-cta']")).click();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement from=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
			
			from.click();
			
			//driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
			

			
		}
		}
		   
		   
		

		
		

		
		
		
		
		




