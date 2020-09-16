package TestngBasics1;


	

	import java.io.IOException;
	import java.util.Calendar;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.DataProvider;
	public class exampleTest {
	   FirefoxDriver driver = null;
	   public static boolean keepAlive = true;
	   public static long purgeInterval = 10; // in milliseconds
	   public static long implicitlyWait = 20; // in seconds
	   public static String driverPath = "C:\\.geckodriverexe";

	   // Selenium-TestNG Suite Initialization
	   @BeforeSuite
	public void suiteSetup() {
	       System.out.println("suiteSetup");
	       System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
	       DesiredCapabilities caps = new DesiredCapabilities();
	       caps.setCapability("marionette", true);
	       driver = new FirefoxDriver();
	       startMonitor();
	   }
	
	@AfterSuite
	   public void suiteTeardown() {
	       System.out.println("suiteTeardown");
	       driver.close();
}
