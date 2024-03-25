package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Book effectiveJavaBook = new Book();
		
	Book cleanCodeBook = new Book();
	
	Book artOfComputerProgrammingBook = new Book();
	
	effectiveJavaBook.openBook();
	artOfComputerProgrammingBook.openBook();
	
	cleanCodeBook.IncreaseCopies(10);;
	
	effectiveJavaBook.IncreaseCopies(5); 
	
	artOfComputerProgrammingBook.IncreaseCopies(2);

	
System.out.println(effectiveJavaBook.getNumberOfCopies());

System.out.println(cleanCodeBook.getNumberOfCopies());

System.out.println(artOfComputerProgrammingBook.getNumberOfCopies());
	}

}
