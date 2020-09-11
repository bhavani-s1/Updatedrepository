package TestngBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotations {

	
	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
	
}
}
