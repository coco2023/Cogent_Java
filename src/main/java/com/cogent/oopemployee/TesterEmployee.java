package com.cogent.oopemployee;

public class TesterEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.addEmployee(111, "Han01", "IT", (float) 0.05);		
		emp.deleteEmployee(111);
		emp.updateEmployee(111, (float) 0.07);
		emp.displayEmployee(111);		
	}
}
