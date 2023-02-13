package com.cogent.IOConcepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReader {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//WAP to Add 2 number
		int no1;
		int no2;
		int no3;
		
		System.out.println("hey Pls enter the 2 Numbers");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		no1= Integer.parseInt(br.readLine());
		no2= Integer.parseInt(br.readLine());
		
		no3= no1 + no2;
		
		System.out.println("The result is "+ no3);
			
	}
}
