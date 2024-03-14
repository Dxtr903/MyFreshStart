package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {
//		2. Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).
		
		int[] numbers = {5, 15, 20, 30, 50};
		
		
		
		//using indexed for loop
		//for any array, we need to loop from 0 until the last element of the array
		
		int sum = 0;
		for(int i = 0;i < numbers.length;i++)
		{
			sum += numbers[i];
		}
		System.out.println("The sum is: " + sum);
		
		
		
		//using for each
		
		int sum2 = 0;
		
		for(int num : numbers)
		{
			sum2 += num;
		}
		
		System.out.println("The sum is: " + sum2);
		
		

	}

}
