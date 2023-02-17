package com.cogent.comparatorbasic;

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
		
		for (Employee e : empList) {
			System.out.println("Employee info: " + e);
		}
		
		
		//Want to see the Sorted data As per Name 
				//so now we need comparator..?
				   // new class from comparator interface
				                   //override method ....compare(){...}
				//sort() with comparator we created 
		NameComparotor nc = new NameComparotor();
		Collections.sort(empList, nc);  

		System.out.println("With Any Sorting as Name");
		for(Employee e : empList) {
		System.out.println(e);
		}


	}
	
}
