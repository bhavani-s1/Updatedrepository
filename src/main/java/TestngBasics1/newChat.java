package TestngBasics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newChat {

	static WebDriver driver;
	
	@BeforeTest
	
	public void launch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.phptravels.com/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Open LiveChat chat widget']")));
		Thread.sleep(2000);
		
		WebElement chatButton = driver.findElement(By.xpath("//div[@aria-label='Open LiveChat chat widget']"));
		
		js.executeScript("arguments[0].click();", chatButton);
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bhavani");
		
		Thread.sleep(1000);
	
		WebElement whatsapp=driver.findElement(By.xpath("(//input[@class='lc-1gz7fd7 e1xplv9i0'])[2]"));
		whatsapp.sendKeys("7702101526");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("k.bhavani6@gmail.com");
		
		Thread.sleep(2000);
       
		//WebElement choice=driver.findElement(By.xpath("//input[@class='//input[@class='lc-5mlnfz e81sjne0']"));
		
		//choice.click();
		
		Select choose=new Select(driver.findElement(By.xpath("//select[@class='lc-jjhb0i egtcv0s1']")));
		
		choose.selectByValue("index1_1");
		
		WebElement click1= driver.findElement(By.xpath("//button[@class='lc-tf4jp6 esv0owm0']"));
		
		js.executeScript("arguments[0].click();", click1);
		
	}
       @AfterTest
       
       public void close() {
    	   
    	   driver.close();
    	   
       }
}
