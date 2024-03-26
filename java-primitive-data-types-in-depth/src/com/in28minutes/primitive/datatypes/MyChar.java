package com.in28minutes.primitive.datatypes;

import java.util.IllegalFormatCodePointException;

import javax.swing.plaf.synth.SynthTextPaneUI;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		
	this.ch = ch;
	}

	public boolean isVowel() {
		//step 11 since we want the method to return true/false on characters we need to change it to boolean
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
			
			//we could also go through each if statement like 
			//if(ch == 'a') 
				//return true;
			//if (ch == 'e')
				//return true; and so on... but this would be difficult to understand where the logic is complex however makes it easier to understand
		
		return true;
		//exercise add a check for Capitals
		else if (ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
		return true;
		
		return false;
	}

	public boolean isConsonant() {
		//Step 12 (guess)we can use the value returned from the above method to find consonants because if it is not a vowel 
		//it is a consonant
		
		if(isAlphabet() && !isVowel())
		
		return true;
		
		return false;
		
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		//step 12 create a method to determine if the value is a digit
		// we learned that numbers can have unicode values when cast as a char
		//0-9 are represented by the unicode numbers 48 to 57 (1 to 9)
		//no need to typecast - int(ch) - || or operator does not work
		
		if (ch>=48 && ch<=57)
			
			return true;
		
		return false;
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		//step12 we know that char Alphabet characters have a unicode of 26 to 90 (A-Z) for caps and 97 and 122 for lowercase (a-z)
		if(ch>=97 && ch<=122)
			return true;
		if (ch>=65 && ch<=90)
			return true;
		
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		
		//print all lowercase a-z - unicode values 97-122
		for (char ch = 'a';ch<='z';ch++) {
			
			System.out.println(ch);
	}
	}
	
	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
for (char ch = 'A';ch<='Z';ch++) {
			
			System.out.println(ch);
	}

	}


}
