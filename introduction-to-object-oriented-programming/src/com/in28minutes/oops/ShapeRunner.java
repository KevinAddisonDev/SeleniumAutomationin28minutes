package com.in28minutes.oops;

public class ShapeRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Shape rectangleShape = new Shape(10,10);

		
		System.out.println("The Surface Area of the shape is " + rectangleShape.calculateArea(rectangleShape.getSideLength(), rectangleShape.getSidebreadth()));
	}

}
