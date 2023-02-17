package com.cogent.setConcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetPrac {
	public static void main(String args[]) {

	LinkedHashSet<Integer> info2 = new LinkedHashSet<Integer>();//Oreder fixed same of insertion
	info2.add(11);
	info2.add(111);
	info2.add(113);
	info2.add(114);
	info2.add(111);
	info2.add(115);
	//info.add("abc");  Not Valid

	System.out.println(info2);

	System.out.println(":::::::::::::");
	
	}
}
