package com.cogent.basics;

public class operatorTask {

	public static void main(String[] args) {
		int number = 20;
		
		// 8 operators
		number += 1;
		System.out.println(number);

		int multiplyNum = number * 2;
		System.out.println(multiplyNum);
		
		int minusNum = number % 3;
		System.out.println(minusNum);

		System.out.println("number++ " + number++);
		System.out.println("++number " + ++number);
		
		int newNum = minusNum + 5;
		System.out.println(newNum);
		
		System.out.println(newNum > number);
		
		System.out.println(newNum == number);
		
		System.out.print("true || false & true: ");
		System.out.println(true || false & true);

		System.out.println("success!");	
		

	}

}
