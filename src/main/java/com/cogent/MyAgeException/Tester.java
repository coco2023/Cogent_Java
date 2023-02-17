package com.cogent.MyAgeException;

public class Tester {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		VoteApp voteApp = new VoteApp();
		voteApp.isValid(20);
		voteApp.isValid(15);

	}

}
