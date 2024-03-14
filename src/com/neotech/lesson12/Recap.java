package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

		
		int[] grades = new int[5];  //[0, 0, 0, 0, 0]
		
		
		System.out.println("The size of this array is: " + grades.length);
		
		System.out.println("Grade with index 2 is: " + grades[2]);
		
		// 0  1  2  3  4  (indexes)
		//[0, 0, 0, 0, 0] (values)
		
		grades[3] = 85;

		// 0  1  2  3  4  (indexes)
		//[0, 0, 0, 85, 0] (values)
		
		
	//	grades[15] = 100; //run time error - only happens if we run it
	//	grades[3] = "Three"; //compile error - even without running Java is telling us its wrong.
		
		
		grades[2] = 100;
		// 0  1  2  3  4  (indexes)
		//[0, 0, 100, 85, 0] (values)
		
		grades[4] = 95;
		// 0  1   2   3   4  (indexes)
		//[0, 0, 100, 85, 95] (values)
		
		grades[1] = 90;
		// 0  1   2   3   4  (indexes)
		//[0, 90, 100, 85, 95] (values)

		grades[0] = 80;
		// 0    1   2   3   4  (indexes)
		//[80, 90, 100, 85, 95] (values)
		
		//Re-assigning the value of the first element
		grades[0] = 83;
		// 0    1   2   3   4  (indexes)
		//[80, 90, 100, 85, 95] (values)
		
		//Can I find the average of the grades?
		
		//1st way:
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		System.out.println("Sum of grades is: " + total);
		
		int average = total/5;
		System.out.println("The average is: " + average);
		
		
		//2nd way - using for loop
   		int sum = 0;
		for (int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + sum/grades.length);
		
		
		
		String[] cities = {"DC", "Tirana","Ankara", "Rome", "Paris", "Berlin"};
		
		System.out.println("The length of the array is: " + cities.length);
		
		//how can I print the last element
		int length = cities.length;
		System.out.println("The last city is: " + cities[length-1]);
		
		
		//how would I print all the cities???
		//loop 5 times --> 0 1 2 3 4 --> i < 5 or i <= 4
		//if you are using <= --> you would want to include the last element of the array
		//if you are using < --> then you make sure you use the size of the array
		for (int i = 0; i < cities.length;i++)
		{
			System.out.print(cities[i] + ", ");
		}
		
		System.out.println();
	
		//print the array in reverse order
		for (int i = cities.length-1; i >= 0; i--)
		{
			System.out.print(cities[i] + ", ");
		}
		
	}

}
