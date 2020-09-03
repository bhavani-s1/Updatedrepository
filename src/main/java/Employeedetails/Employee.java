package Employeedetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Employee {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
	static Map<Object, List<String>>map;

		
		int empid;
		String ename;
		String dept;
		int sal;
		int choice;
		
		map = new HashMap<Object, List<String>>();
		
		do{		
			System.out.println("Enter your choice");
			System.out.println("1.Add employee details");
			System.out.println("2.Search employee");
			System.out.println("3.Delete employee");
			System.out.println("4.Display employee details");
			System.out.println("5.Exit");
			
			choice=scan.nextInt();
			
		}
		
		switch(choice) {
		
		case 1:
			Addemp add = new Addemp();
			add.addRecord();
			break;

			
		}
		
		

	}

}
