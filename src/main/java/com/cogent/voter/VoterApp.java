package com.cogent.voter;

public class VoterApp {
	boolean checkEligibity(int age) {
		if (age >= 18) {
			System.out.println("You can Vote");
			return true;
		}
		else {
			System.out.println("You can not Vote!");
			return false;
		}
	}	
}
