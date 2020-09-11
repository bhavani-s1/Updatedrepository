package Employeedetails;

public class EmployePojo {

	
	int id;
	String name;
	String department;
	String designation;
	int sal;

	public void Employee(int id, String name, String department, String designation) {

	this.id = id;
	this.name = name;
	this.department = department;
	this.designation = designation;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployePojo other = (EmployePojo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
	return id;
	}

	public  void setId(int id) {
	this.id = id;
	}

	public String getName() {
	return name;
	}

	public  void setName(String name) {
	this.name = name;
	}

	public String getDepartment() {
	return department;
	}

	public  void setDepartment(String department) {
	this.department = department;
	}

	public String getDesignation() {
	return designation;
	}

	public  void setDesignation(String designation) {
	this.designation = designation;
	}

	@Override
	public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", "
			+ "designation=" + designation
	+ "]";
	}

	//public void setSalary(String next) {
		
	//	this.sal=sal;
		
	//}

	}
	

