package com.neotech.lesson18;

public class Dog {
	//instance or object variables
	String name;
	int age;
	
	//Let's create static variables
	static String breed = "Husky";
	static int paws = 4;
	
	void displayDogInfo() {
		//breed = "Test"; //This is possible but not applicable now
		System.out.println("Name: " + name + " age: " + age + " breed: " + breed + 
							" paws " + paws);
	}

}