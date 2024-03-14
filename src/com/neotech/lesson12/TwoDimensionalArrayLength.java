package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {

		String[][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"}
			};

		int rows = months.length;
		
		System.out.println("rows --> " + rows);

		/*
		 
		   0		1		2
	0	 December January February
	1	 March 		April	May
	2	 June 		July	August
	3	 September	October	November
		 
		
		 */
		
		int lengthOfRowIndex1 = months[1].length;
		System.out.println("The length of the row with index 1 ---> " + lengthOfRowIndex1);
		
	}

}
