package com.cogent.MyAgeException;

public class AgeException extends Exception {
	
	public AgeException(String msg) {
		super(msg);
		System.out.println("MyAgeException created");
	}
}
