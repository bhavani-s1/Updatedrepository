package TestngBasics1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	@BeforeSuite
	
	public void setup() {
		
		//System.out.println("Setup system property for chrome");
		System.out.println("BeforeSuite Annotation");
		
	}
	
@BeforeTest
	
	public void login() {
		
		System.out.println("before test annotation");
		
	}
	
	@BeforeClass
	
	public void launchBrowser() {
		
		//System.out.println("launch browser");
		System.out.println("BeforeClass annotation");
	}
	
	@BeforeMethod
	
	public void Enterurl()
	
	{
		
		System.out.println("before method annotation");
	}
	
	

	@Test
	
	public void googletest()
	{
		
		System.out.println("test annotation");
		
		
	}
	
	@Test
	
	public void search() {
		System.out.println("test2 annotation");
	}
	@AfterMethod
	
	public void logout()
	{
		System.out.println("After method annotation");
		
	}
	
@AfterClass
	
	public void closebrowser()
	{
		System.out.println("After class annotation");
	}
	
	@AfterTest
	
	public void delete() {
		
		System.out.println("After test annotation");
		
	}
	
	
	
	
	}
	
	



