package com.cogent.oopLibrary;

public class TesterLibrary {

	public static void main(String[] args) {

		Library lib = new Library();
		Library.librarian = "Mary";
		lib.student = "Han";
		System.out.println("Library.librarian: " + Library.librarian);
		System.out.println("lib.librarian: " + lib.librarian);
		System.out.println("lib.student: " + lib.student);
		
		lib.display("The old man and the sea");
	}

}
