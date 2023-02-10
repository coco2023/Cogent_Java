package com.cogent.saticExam;

public class ExamProtal {

	static int noq;
	String type;
	int result;
	
	void addQues(int result) {
		if ( result > 100 ) {
			for (int i = 0; i < (result - 100); i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	void disQues(int result) {
		if ( result % 2 == 1 ) {
			for (int i = 980; i < 1000; i++) {
				if ( i % 2 == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	static void showResult(int result) {
		if (result > 40) {
			System.out.println("\n" + noq + " Success! ");
		}
	}
	
	ExamProtal(int noq, String type, int result){
		super();
		this.noq = noq;
		this.type = type;
		this.result = result;
	}
	
	
}
