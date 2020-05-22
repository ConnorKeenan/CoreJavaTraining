package com.cognixia.jump.salesforce.classesObjects;

public interface Truck {
	
	// Interface Variables
	int WHEELS = 4;
	
	// Java 8 Methods
		// default
	default void start() {
		System.out.println("Truck Started up");
	}
	
		// static
	static void milesTraveled(double miles) {
		System.out.println("This has travelled " + miles + ".");
	}
	
	// Abstract Methods (Normal Interface Methods)
	double getTowingCapacity();
	void setTowingCapacity(double towing);
	
	void drive();
	void drive(double miles);
	double drive(double miles, String location);

}
