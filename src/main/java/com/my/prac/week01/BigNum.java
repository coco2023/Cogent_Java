package com.my.prac.week01;

public class BigNum {

	
	public int findBiggerNum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else if (num2 > num1) {
			return num2;
		}
		else {
			return num2;
		}
	}
	
	public int[] swapNumTemp(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		return new int[] {num1, num2};
	}
	
	public int[] swapNum(int num1, int num2) {
		return new int[] {num2, num1};
	}
	
	public String ternaryOperatsor(int num) {
		if (num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}
	
	public int findBiggerNum3(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			} else if (num1 < num3) {
				return num3;
			} else {
				return num1;
			}		
		}
		else if (num1 < num2) {
			if (num2 > num3) {
				return num2;
			} else if (num2 < num3) {
				return num3;
			} else {
				return num3;
			}
		}
		else if (num1 > num3) {
			return num1;
		}
		else {
			return num3;
		}
	}
		
			
	public boolean charVowel(char charactor) {
		char[] vowel = {'A', 'E', 'I', 'O', 'U', 'Y', 'W'};
		for (int i = 0; i<vowel.length; i++) {
			if (charactor == vowel[i]) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
}
