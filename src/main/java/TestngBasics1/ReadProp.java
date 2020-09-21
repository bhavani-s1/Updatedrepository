package TestngBasics1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		//how to read properties file
		
		//create an object of properties class
		
		Properties prop= new Properties();

		//create object of fileinputstream and give the path of properties file
		
		FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\Newdemo\\src\\main\\java\\TestngBasics1\\config.properties");
		prop.load(ip);
	
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		
		System.out.println("emailid");
		
		System.out.println("password");
		
		
		
	}

}
