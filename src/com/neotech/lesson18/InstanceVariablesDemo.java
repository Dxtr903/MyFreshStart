package com.neotech.lesson18;

public class InstanceVariablesDemo {

	public static void main(String[] args) {
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		//To use an instance variable, you don't have to
		//assign a value, unless it's needed
		
		InstanceVariables obj2 = new InstanceVariables();
		obj2.name = "Adela";
		System.out.println(obj2.name);
		
		System.out.println("-----------");
		System.out.println(obj1.name);
	}

}