package Employeedetails;

public class SearchEmployeeRecord extends Employee {

void searchRecord() {
		
		System.out.println("Enter the id of the employee you want to search from the list");
		id = input.next();
		if (map.containsKey(id))
		{
			System.out.println("ID | NAME | DEPARMENT | DESIGNATION");
			

			System.out.print(id + map.get(id) + "\n\n");
			System.out.println("Record has been found...!");
		} 
		else {
			System.out.println("Record Not found..!!");
		}
		
	}
}


