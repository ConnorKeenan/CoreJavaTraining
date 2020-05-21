package com.cognixia.jump.salesforce.classesObjects;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal elephant = new Animal(5, "Elephant");
		Dog dog = new Dog();
		
		Dog dog1 = new Dog();
		
		
		
		System.out.println("count is " + Dog.getCount());
		
		
		//bark.setType("Dog");
		
		
		
//		elephant.setWeight(5.0);
//		
//		elephant.setType("Elephant");
		
		
		elephant.move(46);
		dog.move(10);
		System.out.println(dog);
		

	}
	
	// This is a method within our Driver class, but written outside
	// of Main method
	
	public static int sum(int a, int b) {
		return a + b;
	}

}
