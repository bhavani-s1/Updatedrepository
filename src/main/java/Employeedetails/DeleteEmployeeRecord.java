package Employeedetails;

public class DeleteEmployeeRecord extends Employee {

	
void deleteRecord() {
		
		System.out.println("Enter the id of the employee you want to delete from the list");
		id = input.next();

		map.remove(id);
		
		System.out.println("Record has been deleted...!");
		
	}

}

	

