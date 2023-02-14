package com.cogent.exception;

public class ZeroValueException {
	
	public static void main(String[] args) {

	System.out.println("Hey how you all doing");
	System.out.println("Lets initialize some numbers!");
	int no1=10;
	int no2=0;
	
	System.out.println("all good so far!");
	int no3;
	no3= no1 / no2;  //-----important line  infinity  Abnormal Situation
	//JVM activates
	//Will idetify Problem and Accordingly Exception Object gets created
	//and created exception Object gets thrown
	//which leads to Abrupt termination of Application
	
	
	System.out.println("the result is "+ no3);
	System.out.println("Success");
	}
	
}
