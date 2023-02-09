package com.cogent.voter;

public class TesterVoter {
	
	public static void main(String[] args) {
		VoterApp voterapp = new VoterApp();
		
		boolean valid = voterapp.checkEligibity(10);	
		
		boolean valid2 = voterapp.checkEligibity(15);
		
		boolean valid3 = voterapp.checkEligibity(18);
		
		boolean valid4 = voterapp.checkEligibity(20);
	}
}
