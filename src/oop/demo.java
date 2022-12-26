package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Amine";
		person1.email = "mohamed@gmail.com";
		person1.phone ="0613737495";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		// TODO Auto-generated method stub
		
		Person Person2 = new Person();
		Person2.name= "wiem";
		
		Person2.walk();
		
		/*
		// Attributes, variables, adjectives, descriptions
		String name = "Amine";
		String email = "mohamedaminegritli@gmail.com";
		String phone = "0613737495";
		
		// Action, activity, behavior
		
		//System.out.println(name + " is an engineer");
		//System.out.println(name + " is an engineer in AirFrance");
		job(name);
		
		// Attributes, variables, adjectives, descriptions
		String name2 = "Wiem";
		String email2 = "manaa.wiem201o@gmail.com";
		String phone2 = "23135141";
		
		job(name2);
				
				// Action, activity, behavior
				
				//System.out.println(name2 + " is a radiologue ");
				//System.out.println(name2 + " is a radiologue in center znaidi");
		
			// Enhance by adding functions to minimize code
		*/

	}
	/*
	static void job(String name) {
		System.out.println(name + " is an engineer");
		
	}
	*/

}
