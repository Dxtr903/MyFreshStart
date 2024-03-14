package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		cat1.name = "Mila";
		cat1.weight = 3;
		cat1.color = "Black";
		
		cat1.sayMeow();
		cat1.displayCatInfo();
		
		Cat cat2 = new Cat();
		cat2.name = "Kira";
		cat2.weight = 13;
		cat2.color = "Yellow";
		System.out.println("=============");
		cat2.displayCatInfo();
		
		System.out.println("============");
		
		System.out.println(cat1.name + " is " + cat1.color);
		System.out.println(cat2.name + " is " + cat2.color);
		
		System.out.println("============");
		cat1.name = "Barbunya";
		System.out.println(cat1.name);
		//will cat2 name change? Not!
		System.out.println(cat2.name);
		
		System.out.println("-----------");
		cat1.displayCatInfo();
		cat2.displayCatInfo();

		
	}

}