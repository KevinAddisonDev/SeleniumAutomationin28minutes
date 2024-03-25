package com.in28minutes.oops;


public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MotorBike ducati = new MotorBike(); - before Step 14 "Constructors" 
		
		//MotorBike hondaBike = new MotorBike(); - before step 14 "Constructors"
		
		MotorBike ducati = new MotorBike(2); //Step 14 added constructors which now mean that speed is required to have a value on initialization of the motorbike object
		
	    MotorBike hondaBike = new MotorBike(5);
		
		ducati.start();
		hondaBike.start();
		System.out.println(ducati.getSpeed());
		System.out.println(hondaBike.getSpeed());
		//because speed is an instance variable inside the MotorBike Class, we can only access speed on an instance of the class such as ducati or honda
		//ducati.speed = 0;
		//hondabikBike.speed = 0;
		
		//the state of an object will continue to change throughout the lifecycle of the object
		
		//ducati.speed = 20; 
		//hondabikBike.speed = 10; - not valid to encapsulation principles
		
		
		//or we can do this with a behaviour of the class - this is better programming according to OOP methods. 
		//This is done to protect the object being changed by other objects. other classes will only be able to use methods to update the value of private attributes
		
		//ducati.setSpeed(0);
		
		
		//step 11 encapsulation level 2. if we wanted to increase the speed of a bike object we need to do 3 things 
		int ducatiSpeed = ducati.getSpeed();//first, get the speed of the instance we want to increase 
		ducatiSpeed = ducatiSpeed + 10;//second, increase it with the amount we want to add
		ducati.setSpeed(ducatiSpeed);//third, set the speed variable to the ducatiSpeed variable created above   
		// ** to do the above with honda would mean repeating the code above with the hondaBike variable. 
		// ** this would be better done through a method in the parent class since all Bikes will be making use of it.
		
		System.out.println(ducati.getSpeed());
		
		//hondaBike.setSpeed(0);
		//step 11 - now if we want to increase a bike speed we only need to call the increaseSpeed method and give it the speedValue to increase with
		hondaBike.increaseSpeed(20); // one line called as opposed to 3
	
		System.out.println(hondaBike.getSpeed());
	

	}

}
