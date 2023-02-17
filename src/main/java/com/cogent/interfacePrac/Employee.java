package com.cogent.interfacePrac;

public interface Employee {
	int empId = 0; // final
	
	default void add() {};
	
	static void display() {};
	
	}
