package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
//		3. Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//		(use 2 different loops).

		
		String[] countries = {"Albania", "Turkiye", "Italy", "Iraq", "Brasil"};
		
		//using indexed for loop
		
		for (int i = 0; i < countries.length;i++)
		{
			if (countries[i].equals("Albania"))
			{
				System.out.println(countries[i] + " - Tirana");
			}
			else if (countries[i].equals("Turkiye"))
			{
				System.out.println(countries[i] + " - Ankara");
			}
			else if (countries[i].equals("Italy"))
			{
				System.out.println(countries[i] + " - Rome");
			}
			else if (countries[i].equals("Iraq"))
			{
				System.out.println(countries[i] + " - Baghdad");
			}
			else if (countries[i].equals("Brasil"))
			{
				System.out.println(countries[i] + " - Brasilia");
			}
			else
			{
				System.out.println("We do not know!");
			}
		}
		
		
		System.out.println("----------------------");
		
		for (String country : countries)
		{
			if (country.equals("Albania"))
			{
				System.out.println(country + " - Tirana");
			}
			else if (country.equals("Turkiye"))
			{
				System.out.println(country + " - Ankara");
			}
			else if (country.equals("Italy"))
			{
				System.out.println(country + " - Rome");
			}
			else if (country.equals("Iraq"))
			{
				System.out.println(country + " - Baghdad");
			}
			else if (country.equals("Brasil"))
			{
				System.out.println(country + " - Brasilia");
			}
			else
			{
				System.out.println("I do not know!");
			}
				
		}
		
	}

}
