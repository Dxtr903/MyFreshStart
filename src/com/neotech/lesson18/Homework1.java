package com.neotech.lesson18;

public class Homework1 {
	
//  Create a String and print it in reverse order (Sunday → yadnuS). 
		 //   Solve it using charAt(), toCharArray()  and reverse() methods.
		//    Note:
		 //       for charAt() and toCharArray() use String
		 //       for reverse you have to declare a StringBuffer object


	public static void main(String[] args) {
		
	//	String str ;    this is  immutable
	//	StringBuffer str1; this is mutaple
		
		String str = "Sunday";
		//1st way; using charAt()
		// use the reverse of index
		// star at str.length() - 1  and end by index 0
		
		for (int i = str.length() - 1; i >= 0 ; i++) {
			char c =str.charAt(i);  // get the character at index i and assign it to c
			System.out.println(c);
		}
		System.out.println();
		
		//2nd way ;using toCharArray() 
		//this method converts a string into an array of individual characters of the string
		char [] charArray = str.toCharArray();
		
		//length() is a method
		//length is an attribute
		for (int i = charArray.length -1; i >= 0 ; i++) {
			char c = charArray[i];
			System.out.println(c);
		}
		
		// 3rd way :using StringBuffer
		StringBuffer strBuffer = new StringBuffer(str);
		
		strBuffer.reverse();
		System.out.println(strBuffer);
		 //4th way :using StringBuilder
		
		


	}

}
