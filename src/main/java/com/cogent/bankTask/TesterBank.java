package com.cogent.bankTask;

public class TesterBank {

	public static void main(String[] args) {
		BankApp bankApp = new BankApp();
			// object reference -- point to some Address --- > Object
		bankApp.depositAmt();
		bankApp.withdrawAmt();
		bankApp.showBal();
		
		System.out.println("Thanks for using Banking Services ! ");
	}
	
}
