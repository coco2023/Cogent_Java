package com.cogent.comparableBasic;

import java.util.ArrayList;
import java.util.Collections;

public class BusinessLogic {

	void addRecords() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(111, "Zhao", "HR", 1000));
		empList.add(new Employee(112, "Qian", "IT", 2000));
		empList.add(new Employee(113, "Sun", "SALES", 5000));
		empList.add(new Employee(114, "Li", "ADMIN", 3000));
		empList.add(new Employee(115, "Zhou", "MARKET", 6000));
		empList.add(new Employee(116, "Wu", "CUSTOMER", 4000));
		
		System.out.println(empList.toString());
		
		Collections.sort(empList);  

		System.out.println("With Any Sorting as Name");
		for(Employee e : empList) {
		System.out.println(e);
		}


	}
	
}
