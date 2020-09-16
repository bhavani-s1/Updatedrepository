package TestngBasics1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

	
	static WebDriver driver;
	
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.ixigo.com/");
		
		driver.manage().window().maximize();
		
	}
		
	public void signup() {
		
		driver.findElement(By.xpath("//span[@class='user-login ixi-icon-user']")).click();
	
		//signup
		driver.findElement(By.xpath("//div[@class='google-login']//div[@class='u-ripple']")).click();
		
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("span[contains(text(),'SIGN UP')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='google-login']//div[@class='u-ripple']")).click(); //using googlelogin
		
		//driver.findElement(By.className("u-ripple")).click();
		
		Set<String> handler= driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();
		
		String parentwindowid=it.next();
		
		System.out.println("parent window id" +parentwindowid);
		
		String childwindowid=it.next();
		
		System.out.println("child window id" +childwindowid);
		
		driver.switchTo().window("childwindowid");
		
		
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("k.bhavani6@gmail.com"); //mail id
		
		driver.findElement(By.className("password")).sendKeys("Asaheb@123"); //password
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click(); // next button
		
		//Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='c-dropdown list']")));  
		
		//dropdown.selectByVisibleText("MS");  */
	}

	
	public static void main(String[] args) {
	
		HandlingWindows hw= new HandlingWindows();
		
		hw.launchBrowser();
		hw.signup();
		
		
	}	
}
