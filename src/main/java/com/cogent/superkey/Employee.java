package com.cogent.superkey;

public class Employee {

	int id=700;
	String name;
	Employee() {
		System.out.println("Employee");
	}
	
	Employee(String name){
		this.name = name; // this KW is used with instance var
		
	}
	
	Employee(int data) {
		System.out.println("Employee" + data);
	}
	
	void addEmp() {
		
		System.out.println("I will Add Employee");
	}

}
