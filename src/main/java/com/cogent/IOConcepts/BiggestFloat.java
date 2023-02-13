package com.cogent.IOConcepts;

import java.util.Scanner;

public class BiggestFloat {
	
    static float BiggestFlo(float f1, float f2, float f3) {
    	if (f1 > f2) {
    		if (f1 > f3) {
    			return f1;
    		} 
    		else if (f1 < f3) {
    			return f3;
    		} 
    		else {
    			return f1;
    		}
    	}
    	else if (f2 > f1) {
    		if (f2 > f3) {
    			return f2;
    		}
    		else if (f2 < f3) {
    			return f3;
    		}
    		else {
    			return f2;
    		}
    	}
    	else {
    		if (f1 > f3) {
    			return f1;
    		}
    		else if (f3 > f1) {
    			return f3;
    		}
    		else {
    			return f1;
    		}
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		float f1 = scanner.nextFloat();
		float f2 = scanner.nextFloat();
		float f3 = scanner.nextFloat();
		
		float biggestFloat = BiggestFlo(f1, f2, f3);
		System.out.println("The biggest float is: " + biggestFloat);
		
	}

}
