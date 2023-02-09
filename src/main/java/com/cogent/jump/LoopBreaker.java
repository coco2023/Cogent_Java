package com.cogent.jump;

public class LoopBreaker {

	
	void runCode() {
		for ( int i = 1; i <= 10; i++) {
			
			if ( i == 5 ) {
				System.out.println("Skip i == 5");
				continue;
			}
			
			System.out.println("This is " + i);
		}
		
		System.out.println("Loop Over");
	}
}
