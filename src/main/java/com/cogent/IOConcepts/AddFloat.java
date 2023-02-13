package com.cogent.IOConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddFloat {

	public static void main(String[] args) throws NumberFormatException, IOException {

		float f1;
		float f2;
		float f3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		f1 = Float.parseFloat(br.readLine());
		f2 = Float.parseFloat(br.readLine());
		f3 = Float.parseFloat(br.readLine());

		float res = f1 + f2 + f3;
		
		System.out.println("The result is " + res);
		
	}
	
}
