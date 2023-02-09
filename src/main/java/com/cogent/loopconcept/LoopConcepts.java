package com.cogent.loopconcept;

public class LoopConcepts {
	
	void runLoops( int start, int end) {
		int counter = 0;
		for ( int i = start; i <= end; i++ ) {
			counter += 1;
			System.out.println("value of counter: " + counter);
		}
	}
}
