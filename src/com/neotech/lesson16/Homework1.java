package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1 {
	/*
	Create a method createEmail(). Based on provided users firstName, lastName and emailType, 
	your method should return complete email address.
			Example: 
			firstName -> john
			lastName -> snow
			emailType -> g mail
			return -> john snow@gmail.com
	*/
	
	// return type(void ,int,String ,car)      methodName( input parameters)
	
//	{
//		..code
//	    ..code
//       
//	    return something (this statement depends on the return type)
//	}
//	
	
	
//	INPUTS:  firstName, lastName and email
//	OUTPUTS: FIRSTNAME  + LASTNAME + emailType  (String)
// 	Internal: Operation: Concatenate inputs	
	
	String   createEmail(String firstName, String lastName ,String emailType)
	{
	
	// return type defines what you need to send back (return something)
		
		String email =firstName + lastName + "@" +  emailType + ".com";
		
		return email;
		
		
	}
	public static void main(String[] args) {
		
		Homework1 hw = new Homework1();
		// I could use it anywhere myself
		String myEmail = hw.createEmail("ali", "zahir", "gmail");
		System.out.println("My email : " + myEmail);
		
		// i can also get info from a user and use this to create them an email
		Scanner  sc =new Scanner(System.in);
		
		System.out.println("Please enter your first name :");
		String firstName = sc.next();
		
		System.out.println("Please enter your first name :");
		String lastName = sc.next();
		
		System.out.println("Please enter your email type :");
		String emailType = sc.next();
		
		String fullEmail = hw.createEmail(firstName, lastName, emailType);
		System.out.println("Your email is :" + fullEmail);
		
		
		
	}
	
	
	
	
	
	

}
