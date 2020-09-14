package TestngBasics1;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcart {

	//static Alert alert;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("itemc")).click();
        driver.findElement(By.linkText("Sony vaio i5")).click(); //selecting item
        //driver.findElement(By.className("btn btn-success btn-lg")).click();
        
       driver.findElement(By.linkText("Add to Cart")).click();
        
     //driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
        
      Alert alert = driver.switchTo().alert();
        
       String alertMessage= alert.getText();
        
       System.out.println(alertMessage);
		
	}

}
