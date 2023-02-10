package com.cogent.saticExam;

public class TesterExamProtal {

	public static void main(String[] args) {
		ExamProtal examPro = new ExamProtal(11, "math", 90);
		
		examPro.addQues(110);
		examPro.disQues(109);
		
		examPro.showResult(examPro.result);
	}

}
