package com.cogent.StringMethod;

public class BufferMethod {
	public static void main(String[] args) {
		
		// https://www.educba.com/stringbuilder-class-in-java/
		System.out.println("This is StringBuffer");
		StringBuffer strBuf = new StringBuffer("Welcome");
		strBuf.insert(0, "Hi ");
		System.out.println(strBuf);
		
		strBuf.append("!!!!!");
		System.out.println(strBuf);
		
		System.out.println(strBuf.capacity());
		System.out.println(strBuf.length());
		
		strBuf.replace(14, 15, "~~~~");
		System.out.println(strBuf);
		
		strBuf.delete(0, 3);
		System.out.println(strBuf);

		System.out.println(strBuf.charAt(3));
		
		
		StringBuffer strBuf2 = new StringBuffer("Hello");
		System.out.println(strBuf2);

		strBuf2.reverse();
		System.out.println(strBuf2);
		
		System.out.println(strBuf2.capacity());
		
		System.out.println("This is StringBuffer");

	}
}
