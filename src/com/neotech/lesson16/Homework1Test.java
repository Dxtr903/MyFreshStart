package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1Test {

	public static void main(String[] args) {
		
		// in order for anyone to use it they should call it properly (they must understand the documentation)
		//the method signature is this:
		      // it needs three strings   (string,string,string)
		      // it sends back a string
		

		Homework1 hw = new Homework1();
		
        Scanner  sc =new Scanner(System.in);
		
		System.out.println("Please enter your first name :");
		String firstName = sc.next();
		
		System.out.println("Please enter your first name :");
		String lastName = sc.next();
		
		System.out.println("Please enter your email type :");
		String emailType = sc.next();
		
		String fullEmail = hw.createEmail(firstName, lastName, emailType);
		System.out.println("Your email is :" + fullEmail);
		
		// scanner is just some more combination of the code
		// but i can use this method with whatever information i have
		
		String myEmail = hw.createEmail("ali", "zahir", "gmail");
		System.out.println("My email : " + myEmail);
		
		
	}

}
