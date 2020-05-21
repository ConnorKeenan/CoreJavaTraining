package com.cognixia.jump.salesforce.classesObjects;

public class Animal {

	// Attributes (Nouns)
	private double weight;
	private String type;
	
	// Constructor(s) (Initial building Method)
	Animal() {	
		this.weight = 0;
		this.type = "Animal";
	}
	
	Animal(double weight, String type){
		this.weight = weight;
		this.type = type;
	}
	
	Animal(String type){}
	
	// Methods (Verbs)
	// Access Modifier | Return Type
	public void move(int distance) {
		
		System.out.println("The animal moves " + distance + " meters.");
			
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", type=" + type + "]";
	}
	
	
	
}
