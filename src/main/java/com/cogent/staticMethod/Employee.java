package com.cogent.staticMethod;

public class Employee {

	int id;
	String name;
	static String dept;

	void display() {
		System.out.println(id + "  "+ name + "  " + dept);
	}
	
	void show() {
		System.out.println(id + "  "+ name + "  " + dept);
	}
	
//	static void showStat() {
//		System.out.println(id + "  "+ name + "  " + dept);
//
//	}
	
	
}
