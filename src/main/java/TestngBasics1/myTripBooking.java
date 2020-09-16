package TestngBasics1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myTripBooking {

	
		WebDriver driver;
		@Test(priority=1)
		
		public void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			
			driver.get("https://www.goibibo.com/");
			
			driver.manage().window().maximize();
			
		}
		
@Test(priority=2)
		
		public void login1() throws InterruptedException
		{
		driver.findElement(By.xpath("//a[@id='get_sign_in']")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//facebook login
		
		driver.switchTo().frame("authiframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\'authFBSignInBtn\']")).click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.findElement(By.id("email")).sendKeys("7702101526");
		driver.findElement(By.id("pass")).sendKeys("Manvitreddy@321");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		//WebElement text = driver.findElement(By.id("error_box"));
		//System.out.println(text.getText());
		}
		}
		
		driver.findElement(By.id("authMobile")).sendKeys("7702101526");
		
		driver.findElement(By.id("mobileSubmitBtn")).click();
		driver.getWindowHandle();
		
		driver.findElement(By.id("roundTrip")).click();
		
		//Booking bus
		
		
		
		}	
}
