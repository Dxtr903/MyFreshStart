package com.neotech.lesson12;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[2][4];//[rows][columns] 
		
		// 1 2 3 4
		// 5 6 7 8
		
		//lets initialize values of the first row
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;
		
		//2nd row
		numbers[1][0] = 30;
		numbers[1][1] = 35;
		numbers[1][2] = 40;
		numbers[1][3] = 45;		
		
		//size 2 --> it means indexes: 0, 1 
		
		//how would I print the value 40?
		System.out.println(numbers[1][2]);
		//what about 25?
		System.out.println(numbers[0][3]);
		
		
		System.out.println("---------------------------------");
		
		int[][] nums = {
				{3, 6, 9, 12},
				{5, 10, 15, 20},
				{15, 16, 17, 18}
		};
		
		System.out.println("How can I print 18?");
		System.out.println(nums[2][3]);
		
	//	System.out.println(nums[3][4]); // runtime error: ArrayIndexOutOfBoundsException
		
		
		//reassigning value of 17:
		nums[2][2] = 25;
	}

}
