package com.cogent.EmpArrayList;

import java.util.ArrayList;

public class HRTeam {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	
	
	void addEmp(int id, String name, float salary) {
		Employee emp1 = new Employee(id, name, salary);
		
		if (salary > 50000) {
			empList.add(emp1);
			System.out.println("Extra Bonous For " + emp1.name);
		}
		else {
			System.out.println("Salary is out of range!");
		}
				
//		for (Employee e : empList) {
//			System.out.println(e);
//		}
		
	}

}
