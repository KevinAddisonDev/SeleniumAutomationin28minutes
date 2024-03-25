package com.in28minutes.oops;

public class MotorBike {
	//this is state data that we are creating inside the motorbike class, this allows us to set values for it (instance variable) 
  
private	int speed = 0; //making this private means that the runner class can no longer access it 
	
//to fix it is to create a method that will expose this data to instances of the class 	

//we want to think about the behaviour we want to create for a MotorBike i.e increaseSpeed or decreaseSpeed
//what inputs do we need to increase the speed (this will go into the brackets after the method name)
//what outputs do we need from the method - this will usually be created as a return field or as a void if there is nothing returned 
//- in this case we just want to set or change the value so void will do =
//what name should we give the method - it should relate to what we want the method to do.


int increaseSpeed(int speedValue) {//this is a local method that is only available to the method  
		
		this.speed = speed + speedValue; //step 11 - creating functions to increment or update values is encapsulation level 2 
		return speedValue;//personal test - return the int value so this value can be sent to the print function
	}

void decreasSpeed(int speedValue) {
	
	//this.speed = speedValue - speedValue; // step 12 doing it this way we lose the validation applied to setSpeed 
	//we would have to add back to ensure that speed cannot go below 0. this is code duplication
	setSpeed(this.speed - speedValue); // Step 12 By using the set speed function we ensure that the validation does not need to be written again and the value cannot go below 0
}

//step 14 - Constructors will allow us to create instances in our runner of the object with initial values
 MotorBike(int speed) {//a motorbike needs an initial speed
	// TODO Auto-generated constructor stub
	 
	 this.speed = speed;//we are setting the private int speed (which is an attribute of a motorbike as a requirement of a motorbike instance
}

public int getSpeed() {
	return this.speed;
}

public void setSpeed(int speed) {
	
	if (speed >0)//step 10 adding this condition means that through encapsulation we can add conditions to how the variable can be set. preventing bad data
	this.speed = speed; //this takes our local variable and assigns it a value of the private int speed declared above
}


	void start() {
		
		System.out.println("Vrooom!" + "bike has started");
	}
}
