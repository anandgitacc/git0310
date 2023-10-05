package org.employee;

public class EmployeeDetails { // block or body of class
	
	// private -> access specifier
	// void    -> return type of given method (empty)
	// empName -> method name
	// ()      -> arguments place or input or parameter place
	// {}      -> block or body of the method
	private void empName() {
		// implementation detail / business logic
		// "" -> double quote -> String 
		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void empId() {
		System.out.println("employee id: 1122");
	}
	
	public static void main(String[] args) {
		
		// ClassName objName/refName = new ClassName
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empMobile();
		
	}
	

}
