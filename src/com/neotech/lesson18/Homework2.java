package com.neotech.lesson18;

	//Write a program to print out the following conversion:
	// Today is Tuesday and we have a Java Class!!! to
	// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.

public class Homework2 {
	
	public static void main(String[] args) {
		String str = "Today is Tuesday and we have a Java Class!!!";
		
		//Two step process: 
		//1. split the sentence into words using space 
		//2. reverse individual words 
		
		String [] words = str.split(" "); //we create an array of strings/words of the original sentence
		
		Homework2 hw2 = new Homework2(); //create an object of Homework2
		
		for (String word : words) {
			//1st way
			String reversedWord = hw2.reverseString(word);
			System.out.print(reversedWord + " ");
			
			//You can have the entire process on one line
			//System.out.print(hw2.reverseString(word) + " ");
			
			
			// 2nd way
			//StringBuffer strBuffer = new StringBuffer(word);
			//System.out.print(strBuffer.reverse() + " "); //we need to add a space after each reversed word
														  //it was removed when we converted the sentence into array
		}
		
		System.out.println();
	}
	
	//Let's create a method that reverses each word passed to it
	//What's the input? --> String
	//What's the output? --> String
	
	String reverseString(String input) {
		char []charArray = input.toCharArray();
		String reversedStr = ""; //to hold the reversed string 
		
		
		for (int i = charArray.length-1; i >= 0; i--) {
			reversedStr += charArray[i]; //concatenate the characters to get the reversed string
		}
		return reversedStr;
	}
	
	

}