package com.cogent.UserException;

public class Tester {

	/**
	 * @param args
	 * @throws MyException
	 */
	public static void main(String[] args) throws MyException {
			
			BusinessLogic bl= new BusinessLogic();
			bl.process(1);
			bl.process(8);
	}

}
