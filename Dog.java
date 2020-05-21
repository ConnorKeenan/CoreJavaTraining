package com.cognixia.jump.salesforce.classesObjects;

// Let's talk about Static
// You can have Static - 
	// attributes (variables)
	// methods
	// nested class
	// static blocks


public class Dog extends Animal {

	private String breed;
	private int age;
	private static int count = 0;
	
	Dog(){
		// Our old Animal Class Constructor
		super();
		
		// Specifics for our new Dog Class
		this.breed = "Mutt";
		this.age = 0;
		count++;
//		System.out.println("Contructor executed");
	}
	
	// Methods
	@Override
	public void move(int xdistance) {
		System.out.print("The dog: ");
		super.move(xdistance);
	}
	
	public void move(String xdistance, String ydistance) {
		
	}
	
	public int move(int xdistance, int yDistance, int zDistance) {
		return 0;
	}
	
	// Utility Methods

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Static method
	
	public static int addNumbers(int...a) {
		return 0;
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", weight()=" + getWeight() + ", type()=" + getType()
				+ "]";
	}
	
	// Code Block and Static Code Block
	{
//		System.out.println("Code Block executed");
	}
	
	static {
//		System.out.println("Static Block executed");
	}
	
}
