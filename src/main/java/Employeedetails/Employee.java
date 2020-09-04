package Employeedetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Employee {
	
	static String id;
	static String name;
	static String department;
	static String designation;
	static Map<Object, List<String>> map;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		map = new HashMap<Object, List<String>>();
		
		do {
			System.out.println("Press 1 to Add Record");
			System.out.println("Press 2 to Search Record");
			System.out.println("Press 3 to Delete Record");
			System.out.println("Press 4 to Display All record");
			System.out.println("Press 5 to Exit");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				AddEmployeeRecord add = new AddEmployeeRecord();
				add.addRecord();
				
				break;
			case 2:
				SearchEmployeeRecord search = new SearchEmployeeRecord();
				search.searchRecord();
				break;
			case 3:
				DeleteEmployeeRecord delete = new DeleteEmployeeRecord();
				delete.deleteRecord();
				break;
			case 4:
				DisplayEmployeeRecord display = new DisplayEmployeeRecord();
				display.displayRecord();
				break;
			case 5:
				System.out.println("You have pressed 5..The program has been ended...!!!");
				break;
			default:
				System.out.println("Wrong Choice...!!");	
			}
		} while (choice != 5);
		
	}
}
