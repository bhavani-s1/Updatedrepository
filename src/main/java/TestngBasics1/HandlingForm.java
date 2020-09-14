package TestngBasics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingForm {

	WebDriver driver;
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
	}
	
	public void formComponents() {
		
	
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("bhavani");//firstname
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kore");   //lastname
		
		
	//	WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control ng-pristine ng-valid ng-touched"))).sendKeys("no.2/3,vidyasagarrd,bangalore"); //address
		
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement  
		//(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("no.2/3,vidyasagar rd,bangalore");//address
	}
	
	
	public void mail() {
		
	//driver.findElement(By.xpath
//("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']")).sendKeys("k.bhavani6@gmail.com");//mailid
		
driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("k.bhavani6@gmail.com");
	//driver.findElement(By.xpath
//("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']")).sendKeys("7702101526");	//phone no
	
	//driver.findElement
	//(By.cssSelector("body.ng-scope:nth-child(2) div.container.center div.row:nth-child(2) div.col-sm-6.col-md-6.col-xs-12 form.form-horizontal.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-email.ng-valid-pattern.ng-valid-minlength div.form-group:nth-child(4) div.col-md-4.col-xs-4.col-sm-4 > input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-pattern.ng-touched")).sendKeys("123456789");
	
	driver.findElement(By.name("radiooptions")).click(); //radio button
	
	driver.findElement(By.id("checkbox2")).click();  //checkbox
	
	}
	
	public void dropDown() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("msdd")).sendKeys("English"); //languages
	
	Select dropdown = new Select(driver.findElement(By.id("Skills")));  //select dropdown
	
	dropdown.selectByVisibleText("C++");  
	  
	
	Select dropdown1 = new Select(driver.findElement(By.id("countries")));  //select dropdown
	dropdown1.selectByVisibleText("India");
	
	Select dropdown2 = new Select(driver.findElement(By.id("select2-country-container")));  //select dropdown
	dropdown2.selectByVisibleText("India");
	
	Select year= new Select(driver.findElement(By.id("yearbox")));
	 year.selectByVisibleText("1988");
	 
	 Select month= new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	 
	 month.selectByVisibleText("11");
	 
	 Select day= new Select(driver.findElement(By.id("daybox")));
	 
	 day.selectByVisibleText("06");
	 
	 
	 driver.findElement(By.id("firstpassword")).sendKeys("India@123");
	 
	 driver.findElement(By.id("secondpassword")).sendKeys("India@123");
	 
	 driver.findElement(By.id("submitbtn")).click();
		
	}
	
	

	
	public static void main(String[] args) {
		
		HandlingForm h1= new HandlingForm();
		
		h1.launchBrowser();
		h1.formComponents();
		h1.mail();
		h1.dropDown();
		
		
	}

}
