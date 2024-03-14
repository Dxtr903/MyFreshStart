package com.neotech.lesson18;

public class Cat {
	//instance variables 
	String name = "Bosy";
	int weight;
	String color;
	
	//Methods, behavior, functions --> what the class does in general
	void sayMeow() {
		//local variable to sayMeow
		String word = "meow";
		System.out.println(word);
	}
	
	void displayCatInfo() {
		System.out.println("Name: " + name + " weight: " + weight +
				" color: " + color);
	}
	

}