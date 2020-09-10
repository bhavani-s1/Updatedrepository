package Employeedetails;

import java.util.ArrayList;

public class AddEmployeeRecord extends Employee {

     void addRecord() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.print("Enter Id: ");
		
		id = input.next();
		
		System.out.print("Enter the Name: ");
		
		list.add(input.next());

		System.out.print("Enter the Department: ");
		
		list.add(input.next());
		
		System.out.print("Enter the Designation: ");

		list.add(input.next());
		
		System.out.print("Enter the salary: ");
		
		list.add(input.next());
		map.put(id, list);

		System.out.println("\nRecord has been Added...!");
		
       
	}
}

	
	

