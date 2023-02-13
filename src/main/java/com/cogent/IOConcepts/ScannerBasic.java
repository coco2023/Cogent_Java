package com.cogent.IOConcepts;

import java.util.Scanner;
 
public class ScannerBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1;
		int no2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter No1");
		no1 = scanner.nextInt();
		
		System.out.println("You entered: " + no1);

	}

}
