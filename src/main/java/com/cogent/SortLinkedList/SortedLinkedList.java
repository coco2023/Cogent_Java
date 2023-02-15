package com.cogent.SortLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> floorNum = new LinkedList<Integer>();
		// [2, 4, 19, 6, 3, 1]
		floorNum.add(2);
		floorNum.add(6);
		floorNum.add(4);
		floorNum.add(1);
		
//		Collections.sort(floorNum);
		
		System.out.println(floorNum);
		
		// sort LinkedList		
		for (int i = 1; i < floorNum.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (floorNum.get(i) < floorNum.get(j)) {
					// swap two integers
					int temp = floorNum.get(i);
					floorNum.set(i, floorNum.get(j));
					floorNum.set(j, temp);
				}
			}
		}
		System.out.println(floorNum);
	}

}
