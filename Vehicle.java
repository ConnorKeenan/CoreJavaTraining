package com.cognixia.jump.salesforce.classesObjects;

public interface Vehicle {
	
	default void start() {
		System.out.println("Vehicle Started up");
	}

	boolean isPetrol();
	
	void move();
	
}
