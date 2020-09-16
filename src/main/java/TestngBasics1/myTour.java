package TestngBasics1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myTour {

		static WebDriver driver;
		
		public void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			
			driver.get("https://www.ixigo.com");
			
			driver.manage().window().maximize();
			
		}

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
		   
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("k.bhavani6@gmail.com");
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

		   //driver.findElement(By.xpath("//div[@id='profileIdentifier']")).click();
		   Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Asaheb@123");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		   Thread.sleep(2000);
		
		   //driver.close();
		   
		   //switch to the parent window
		   driver.switchTo().window(parent);
	}
		   
		   }

		}
		
		public void booking()
		{
			driver.findElement(By.linkText("buses")).click();
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			
			myTour m1= new myTour();
			
			m1.launchBrowser();
			
			m1.login1();
			m1.booking();
		}			
}



