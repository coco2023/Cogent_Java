package com.cogent.interfacePrac;

public class Process implements Employee, PayRoll {

	@Override
	public void add() {
		System.out.println("This is the process");
	}
	
	void calculateSalary() {
		System.out.println("Calculate salary");
	}

	@Override
	public void payRoleCal() {
		// TODO Auto-generated method stub
		System.out.println("This is Payroll");
		
	}
	
}
