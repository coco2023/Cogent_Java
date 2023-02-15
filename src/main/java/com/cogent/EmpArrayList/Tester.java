package com.cogent.EmpArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HRTeam hr = new HRTeam();
		hr.addEmp(111, "zhao", 100000);
		hr.addEmp(112, "qian", 200000);
		hr.addEmp(113, "sun", 300000);
		hr.addEmp(114, "li", 40000);	
		
		for (Employee emp: hr.empList) {
			System.out.println("Employee info: " + emp);
		}
	}
}
