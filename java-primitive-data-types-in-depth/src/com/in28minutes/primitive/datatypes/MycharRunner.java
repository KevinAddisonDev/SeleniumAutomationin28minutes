package com.in28minutes.primitive.datatypes;

public class MycharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Step 11 create a function that will return true if the character is a vowel
		
		MyChar myChar = new MyChar('Z');
		//'a','e','i','o','u' and Capitals 
		System.out.println(myChar.isVowel());
		myChar.isConsonant();
		
		
		System.out.println(myChar.isDigit());//step12
		System.out.println(myChar.isAlphabet());//step 12 
		
		System.out.println(myChar.isConsonant());//STEP 13
		MyChar.printLowerCaseAlphabets();//step13 - for these we dont need to use the alphabet/ character that is input 
		//for this it is better to use a static method than create an object because we are not using data from the class
		MyChar.printUpperCaseAlphabets();//step 13 	
	}

}
