package com.in28minutes.oops;

public class Shape {
	
	private int numberOfSides;
	
	private int sideLength;
	
	private int sidebreadth;
	
	
	Shape(int sideLength, int sideBreadth){
		
		this.sideLength = sideLength;
		this.sidebreadth = sideBreadth;
	};

	public int getSidebreadth() {
		return sidebreadth;
	}

	public void setSidebreadth(int sidebreadth) {
		if(sidebreadth > 0)
		this.sidebreadth = sidebreadth;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		if(numberOfSides > 0)
		this.numberOfSides = numberOfSides;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		if(sideLength > 0)
		this.sideLength = sideLength;
	} 
	
	int calculateArea(int sideLength, int sideBreadth) {
		this.sideLength = sideLength;
		this.sidebreadth = sideBreadth; 
		
		int surfaceArea = sideLength * sideBreadth;
		
		return surfaceArea;
	}
	
	

}
