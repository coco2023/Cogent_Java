package com.cogent.StringMethod;

public class BuilderMethod {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/stringbuffer-class-in-java/ 
		System.out.println("This is StringBuilder");
		StringBuilder strBuild = new StringBuilder("Welcome");
		strBuild.insert(0, "Hi ");
		System.out.println(strBuild);
		
		strBuild.append("!!!!!");
		System.out.println(strBuild);
		
		System.out.println(strBuild.capacity());
		System.out.println(strBuild.length());
		
		strBuild.replace(14, 15, "~~~~");
		System.out.println(strBuild);
		
		strBuild.delete(0, 3);
		System.out.println(strBuild);

		System.out.println(strBuild.charAt(3));
		
		
		StringBuffer strBuf2 = new StringBuffer("Hello");
		System.out.println(strBuf2);

		strBuf2.reverse();
		System.out.println(strBuf2);
		
		System.out.println("This is StringBuilder");

	}

}
