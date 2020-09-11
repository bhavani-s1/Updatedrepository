package Employeedetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Employee {
	
	static int id;
	static String name;
	static String department;
	static String designation;
	static int sal;
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
			System.out.println("press 5 to modify record");
			System.out.println("Press 6 to Exit");
			choice = input.nextInt();
			
			//EmployePojo  cl = new  EmployePojo();
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
			case 5:System.out.println("Enter the Id you want to Modify:");
			id = input.nextInt();
		//	ModifyEmp m1= new ModifyEmp();
			//m1.modifyEmp(id);
			case 6:
				System.out.println("You have pressed 6..The program has been ended...!!!");
				break;
			default:
				System.out.println("Wrong Choice...!!");	
			}
		} while (choice != 6);
		
	}
}
