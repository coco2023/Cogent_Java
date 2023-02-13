package com.cogent.superkey;

public class HrDept extends Employee {
		
//	super.id=700;
//	super.id=100;
//	int id=800;

	HrDept() {
//		super(100);
		System.out.println("Child");
	}
	
	void access() {
		
		super.id=100;
		int id=800;
		System.out.println("parent"+ super.id);
		System.out.println(" local"+ id);
		super.addEmp();
	}

}
