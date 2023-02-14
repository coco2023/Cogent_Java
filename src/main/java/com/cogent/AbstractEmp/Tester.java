package com.cogent.AbstractEmp;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SWDept dept = new SWDept();
		dept.add();
		dept.show();
		Employee.show();
		
		String str1 = "ABC"; 
		String str2 = new String("ABC");
		System.out.print(str1.equals(str2));

	}

}
