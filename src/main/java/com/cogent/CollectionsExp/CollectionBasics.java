package com.cogent.CollectionsExp;

import java.util.ArrayList;

public class CollectionBasics {

	public static void main(String[] args) {
		ArrayList<String> arrayStr = new ArrayList<String>();
		ArrayList<Integer> arrayInt = new ArrayList<Integer>(5);
		
		arrayStr.add("Hello");
		arrayStr.add("Weclome");
		arrayStr.add("Hi");
		arrayStr.add("Nice");
		arrayStr.add("Greetings");
		
		System.out.println(arrayStr);
		
		arrayInt.add(1);
		arrayInt.add(20);
		arrayInt.add(200);
		arrayInt.add(60000);
		arrayInt.add(12000000);

		System.out.println(arrayInt);

		for (String str: arrayStr) {
			System.out.println(str);
		}
		
		for (int i = 0; i < arrayInt.size(); i++) {
			System.out.println(arrayInt.get(i));
		}
		
		arrayStr.remove(2);
		System.out.println(arrayStr);
		
		arrayInt.forEach(intNum -> System.out.print(intNum + " "));
		
	}

}
