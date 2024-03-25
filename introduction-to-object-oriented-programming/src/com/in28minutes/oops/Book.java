package com.in28minutes.oops;

public class Book {
	
	private int numberOfCopies; 
	
	void IncreaseCopies (int numberOfAddedCopies) {
		
		this.numberOfCopies = numberOfCopies + numberOfAddedCopies;	
	}
	
	

	public int getNumberOfCopies() {
		return numberOfCopies;
	}



	public void setNumberOfCopies(int numberOfCopies) {
		if (numberOfCopies >0)
			//we can even set exception catching for this 
		this.numberOfCopies = numberOfCopies;
	}



	void openBook() {
		
		System.out.println("This book is now open");
	}
	
	
}
