package com.cogent.variableType;

public class Vehicle {

	int engine; // instance variable
	static int speed = 5; // static variable
//	In simple words, if you use a static keyword with a variable or a method inside a class, then for every instance that you create for that class, these static members remain constant and you can't change or modify them
	
	void startOn(int accelerater) { // local variable
		int totalSpeed = accelerater * speed; // local variable
		System.out.println("***");
		System.out.println("instance: " + engine);
		System.out.println("static instance: " + speed);
		System.out.println("Acc: " + accelerater);
		System.out.println("totalSpeed: " + totalSpeed);
				
	}
	
}
