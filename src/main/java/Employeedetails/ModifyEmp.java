/*package Employeedetails;

import java.util.Scanner;

public class ModifyEmp {

	public void modifyEmp(int id) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		for (Employee EmployePojo : employees) {
			if (employee.getId() == id) {
				do {

					System.out.println(
							"Enter the field you want to modify:\n1.Id\n2.Name\n3.Department\n4.Designation\n5.Salary\n6.Stop Editing");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter Id: ");
						EmployePojo.setId(sc.nextInt());
						break;
					case 2:
						System.out.println("Enter Name:");
						EmployePojo.setName(sc.next());
						break;
					case 3:
						System.out.println("Enter Department:");
						EmployePojo.setDepartment(sc.next());
						break;
					case 4:
						System.out.println("Enter Designation:");
						EmployePojo.setDesignation(sc.next());
						break;
					case 5:
						System.out.println("Enter Salary:");
						EmployePojo.setSalary(sc.next());
						break;
					case 6:
						System.out.println("You have pressed 6.!!Editing has been done..!!");
						break;
					default:
						System.out.println("Wrong Choice..!!");
						break;
					}
					sc.close();
				} while (choice != 6);
		
	}

	
	
}
*/
