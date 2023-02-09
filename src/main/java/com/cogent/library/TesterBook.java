package com.cogent.library;

public class TesterBook {

	public static void main(String[] args) {
		BookApp bookApp1 = new BookApp();
		
		bookApp1.bookAvailable(100);
		bookApp1.bookSold(20);
		
		BookApp bookApp2 = new BookApp();
		
		bookApp2.bookAvailable(50);
		bookApp2.bookSold(10);
		
		System.out.println("Thanks for using our Booking Service");	
		
	}

}
