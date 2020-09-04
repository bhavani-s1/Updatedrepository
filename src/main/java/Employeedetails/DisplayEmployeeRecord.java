package Employeedetails;

import java.util.List;
import java.util.Map.Entry;

public class DisplayEmployeeRecord extends Employee {

	
	void displayRecord()

	{
		System.out.println("Employee details");
		
//for iterating 
		
		for (Entry<Object, List<String>> m : map.entrySet()) {
			System.out.print(m.getKey());
			System.out.print(m.getValue() + "\n\n");
		}

	}
}

	

