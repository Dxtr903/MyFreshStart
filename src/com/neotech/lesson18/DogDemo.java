package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Dogzilla";
		dog1.age = 7;
		
		dog1.displayDogInfo();
		
		dog1.breed = "Shepherd";
		
		Dog dog2 = new Dog();
		dog2.name = "Garip";
		dog2.age = 10;
		
		System.out.println("-------------");
		
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		dog2.breed = "Golden";
		
		System.out.println("-------------");
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		//breed = "XYZ"; //it's local and undeclared 
		
		
	}

}