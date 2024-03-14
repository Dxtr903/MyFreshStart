package com.neotech.lesson18;

public class LocalVariables {

	public static void main(String[] args) {//The scope of the main method
		
		LocalVariables obj1 = new LocalVariables();
		
		obj1.method1();
		obj1.method2();
		
		
		boolean flag = true;
		//The lifetime of flag is the lifetime of the main --> created with the main and 
		// destroyed with the main
		//but it's available for us after declared and assigned a value
		//it must be assigned a value to be used/displayed
		
		if(flag) 
		{ //The scope of if-statement -- starts by { and ends by }
			String answer = "yes";
			System.out.println(answer); //it's possible to display within the if-statement scope
			System.out.println(flag);
		}
		//System.out.println(answer); //local to the if-statement scope but not local to the main
									 //therefore, it's not accessible within the main
									//The scope/lifetime of answer is the lifetime of its scope
		
		System.out.println(flag);  //local to the main --> accessible within the main
		
		System.out.println("----------------");
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		//can I access i here?
		//cannot, it's out of its scope
		//System.out.println(i); //not local
		
		//nested loops
		for (int i = 0; i <= 2; i++) {
			for (int j=0; j <= 2 ; j++) {
				System.out.println(i + " " + j);//this is possible
			}
			//can I display i here?
			System.out.println(i); //yes, it's local
			//can I display j here?
			//System.out.println(j); //its lifetime is finished with its scope (the inner loop)
			
			
		}
	}
	
	void method1() {
		String name = "Rigena";
		int age = 28;
		System.out.println(name);
		System.out.println(age);
	}
	
	void method2() {
		String name = "Adem"; //name here is totally independent from name in method1()
		System.out.println(name);
		//System.out.println(age); //age is not define in this scope
	}

}