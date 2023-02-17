package com.cogent.setConcepts;

import java.util.HashSet;

public class SetHash {
	
	public static void main(String args[]) {
		
	
	//set wont Allow duplications
			HashSet<Integer> info = new HashSet<Integer>();//Oreder not same of insertion
			info.add(11);
			info.add(111);
			info.add(113);
			info.add(114);
			info.add(111);
			//info.add("abc");  Not Valid

			System.out.println(info);
			System.out.println(":::::::::::");
			for (Integer i : info) {
				System.out.println(i);
			}
			System.out.println(":::::::::::::");
		
			
			//TRy Any % methos
			System.out.println(info.isEmpty());
			System.out.println(info.contains(113));
			
			
			
	}

}
