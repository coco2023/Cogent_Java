package com.cogent.comparatorbasic;

import java.util.Comparator;

public class NameComparotor implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// logic to compare objects...
//		return 0;
		
		Employee s1=o1;  
		Employee s2=o2;  
		
				  
		return Float.compare(s1.getSalary(), s2.getSalary());
	}


}
