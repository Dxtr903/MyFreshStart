package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {
		
int 	a 	= 5;			//int a primitive data type
		
		//1st way we used to create a String --- String literal
		String name = "Sabah";		//String is an Object
		
		//2nd way to create a string -- as an object
		String name2 = new String("Ezgi");
		
		
		int size = name.length();
		System.out.println("The length of the name is: " + size);
		
		
		String school = "Neotech";
		System.out.println("The length of the school name is: " + school.length());
		
		
		String school2 = "                Neotech                 ";
		System.out.println("The length of the school name is: " + school2.length());
		
		//toLowerCase(), toUpperCase()
		String city = "New York";   ///this has created an object --> new String("New York")
		String lowerCaseCity = city.toLowerCase();
		System.out.println(lowerCaseCity);
		
		System.out.println(city.toUpperCase());
		
		//what is the value of city?
		System.out.println(city);
		//String objects are immutable!!! --- > it does not change
		
		//we reassigned the city to a new object (not the same as New York)
		city = "New York City";  //This is a new object, it did change New York to New York City

	
		String newCity = "New York"; //here Java did not create a new String
		
		//concat()
		String sentence = "The size of "+ school + " is " + school.length();
		
		String name3 = "Engin";
		String lName3 = "Aktas";
		
		String fullName = name3 + lName3;
		System.out.println(fullName);
		String fullName2 = name3.concat(lName3);
		System.out.println(fullName2);
		
		//what if we want to add space???
		String nameWithSpace = name3 + " " + lName3;
		System.out.println(nameWithSpace);
		String nameWithSpace1 = name3.concat(" ").concat(lName3); //method chaining
		System.out.println(nameWithSpace1);

		//method chaining: I can call the methods belonging to a certain object right after one another.
		String methodChaining = name3.concat(" ").concat(lName3).concat(" ").concat(school).toUpperCase();
		System.out.println(methodChaining);
		
		//isEmpty()
		String str = " ";
		System.out.println(str.isEmpty());
		
		
		//trim() - removed spaces until it sees the first character and removes spaces after the last character
		String str2 = "                    I am 								very 			hungry !! "
				+ "					!							";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		System.out.println("Lenght of str2 is " + str2.length() +" and length of str2.trim() is " + str2.trim().length());
		
		
		
		
		int[] num = {1,2,3,4};
		
		int sizeArray = num.length; //this is a property of array 
		
		
		
		
		
		

	}

}
