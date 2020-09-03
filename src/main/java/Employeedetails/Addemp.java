package Employeedetails;

import java.util.ArrayList;

public class Addemp extends Employee {
	
	public void addrecord() {
	
	ArrayList <String> list= new ArrayList<String>();
	
	System.out.println("enter id");
	
	id=input.next();

	list.add(input.next());
	
	
	System.out.print("Enter the Name: ");
	
	list.add(input.next());

	System.out.print("Enter the Department: ");
	
	list.add(input.next());
	System.out.print("Enter the Designation: ");

	list.add(input.next());

	map.put(id, list);

	}
	
	
}




