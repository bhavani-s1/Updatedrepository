package TestngBasics1;

import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingSelect {


		WebDriver driver;
		
		@Test(priority=1)
		public void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		}
		
		@Test(priority=2)
		
		public void register() {
			
				
			//firstName
			
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kore");
			
			//lastName
			
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bhavani");
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Address	
			driver.findElement
	        (By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bangalore");
			
			
	      //textarea[@class='form-control ng-pristine ng-valid ng-touched']
			//email
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.findElement(By.xpath
("//input[@ng-model='EmailAdress']")).sendKeys("k.bhavani6@gmail.com");
		
//phone

driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7702101526");


driver.findElement(By.name("radiooptions")).click(); //radio button

driver.findElement(By.id("checkbox2")).click();  //checkbox

		}

		
		
	@Test(priority=3)

	public void dropDowns() {
		
			//languages
			 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
		WebElement language=driver.findElement(By.id("msdd"));
		
		language.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
			
	/* List<WebElement> list=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li//a"));
			 
			for(int i=0;i<=list.size();i++) {
				
				//System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().contains("English")) {
					
					list.get(i).click();
					
					
					break;*/
						
		Select dropdown = new Select(driver.findElement(By.id("Skills")));  //select dropdown
		
		dropdown.selectByVisibleText("C++");  
		  
			Select country= new Select(driver.findElement(By.xpath("//select[@id='countries']")));
			
			country.selectByVisibleText("India");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Select country
			
			WebElement selectcountry=driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));

			selectcountry.click();
			for(int i=1;i<=5;i++)
			selectcountry.sendKeys(Keys.ARROW_DOWN);
			selectcountry.sendKeys(Keys.ENTER);

			// DOB
			
			WebElement year= driver.findElement(By.id("yearbox"));
			
			WebElement month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
			
			WebElement day=driver.findElement(By.id("daybox"));
			
			Select s1= new Select(year);
			
			s1.selectByVisibleText("2000");
			
			Select s2= new Select(month);
			
			s2.selectByVisibleText("October");
			
			Select s3= new Select(day);
			
			s3.selectByVisibleText("25");
			
			
			//password
			
			driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("India@123");
			
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("India@123");
			
			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
			
	}
	
		@Test(priority=4)
	public void handlingWindows() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//a[@class='link facebook']")).click();
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> i1=handler.iterator();
		
		String pWindow=i1.next();
		
		System.out.println("parent window"+pWindow);
		
		String cWindow=i1.next();
		
		System.out.println("child window"+cWindow);
		
		
		driver.switchTo().window(cWindow);
		Thread.sleep(2000);
		System.out.println("Child window tilt"+driver.getTitle());
		
		driver.close();
		
		
		
		}	
		
	}
	
	
	
		


