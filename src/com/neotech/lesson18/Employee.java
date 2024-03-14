package com.neotech.lesson18;

public class Employee {
	// ▪ Create a Class called Employee:
	// ▪ Create three variables: eID, salary and set the CEO to “Elion”
	// ▪ CEO should be a static variable
	// ▪ Create a method printInfo() that prints out the eID, salary and
	// CEO of the object
	// ▪ Create two objects of the class Employee
	// ▪ Set the value of eID, salary for each of the objects
	// ▪ Call the printInfo() method for both objects
	// ▪ Change the CEO to “Ahmet”
	// ▪ Call the printInfo() method for both objects
	int eID;
	int salary;
	static String CEO = "Elion";
	
	void printInfo() {
		System.out.println("eID: " + eID + " salary: " + salary + " CEO: " + CEO);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eID = 1;
		emp1.salary = 90000;
		
		Employee emp2 = new Employee();
		emp2.eID = 2;
		emp2.salary = 70000;
		
		emp1.printInfo();
		emp2.printInfo();
		
		//emp1.CEO = "Ahmet";
		Employee.CEO = "Ahmet"; //It's enough to have a class to access to a static variable
								//Why? It's a class-based variable
		//Since we are in Employee class, we can drop Employee itself
		//CEO = "Ahmet";
		
		emp1.printInfo();
		emp2.printInfo();
	}

}