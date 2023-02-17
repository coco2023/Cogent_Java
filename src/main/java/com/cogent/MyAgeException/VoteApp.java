package com.cogent.MyAgeException;

public class VoteApp {
	
	void isValid(int num) throws AgeException{
		if (num < 18) {
			throw new AgeException("The age is less than 18!!");
		} 
		else {
			System.out.println("The age is equals to/ bigger than 18");
		}
		
		System.out.println("Success Evaluation!");
	}
	
}
