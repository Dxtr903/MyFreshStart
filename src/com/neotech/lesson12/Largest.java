package com.neotech.lesson12;

public class Largest {

	public static void main(String[] args) {

//		** Create an array of integers and calculate the largest element in the array
//		(use 2 different loops).

		int[] numbers = {-5, 15, 175, 32, 89, 9, 23};
		
		//lets start with the assumption that the first number is the largest
		int largest = numbers[0];
		
		//in order to be sure I find the largest, I need to go through all the array
		for (int num : numbers) // for each value of numbers ---> 1st loop num = -5, 2nd loop num = 15, 3rd loop num = 75
		{
			//if I find a number that is larger than my current largest number, then update my largest numer
			if (num > largest)
			{
				largest = num;
			}
			
		}
		System.out.println("The largest number is: " + largest);
		
		//using indexed for loop
		
		int max = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
		{
			
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		
		System.out.println(max);
		
	}

}
