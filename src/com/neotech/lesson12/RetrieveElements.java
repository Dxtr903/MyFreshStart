package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		
		//how do we get the values of the array?
		
		//1st way
		for (int i = 0; i < grades.length; i++)
		{
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		
		
		//2nd way: enhanced for loop
		for(char element : grades) //for each element in grades
		{
			System.out.print(element + ", ");
		}
		
		System.out.println();
		
		//					0			1		2			3			4
		String[] fruits = {"Apple", "Orange", "Cherry", "Cucumber", "Grape"};
		
		//looping with an index
		for (int i = 0; i < fruits.length; i++)
		{
			if (fruits[i].equals("Orange"))
			{
				System.out.println(fruits[i] + " is my favorite.");
			}
			else
			{
				System.out.println(fruits[i]);
			}
		}
		
		
		System.out.println("--------------------------------");
		
		for (String fruit : fruits) //for each fruit in the fruits array
		{
			if (fruit.equals("Orange"))
			{
				System.out.println(fruit + " is my favorite.");
			}
			else
			{
				System.out.println(fruit);
			}
		}
		
		//Break and Task: 8:25
		
	//Task 2: 
//		2. Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).
		
//For Those who have done the homework
//		** Create an array of integers and calculate the largest element in the array
//		(use 2 different loops).
	
//	Task3: 
//		3. Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//		(use 2 different loops).	
		
	}

}
