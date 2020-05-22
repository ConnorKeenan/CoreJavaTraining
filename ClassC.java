package com.cognixia.jump.salesforce.classesObjects;

public class ClassC implements Vehicle, Truck {
	
	boolean petrol;
	boolean atv;
	double towCap;
	
	ClassC(){
		this.petrol = true;
		this.atv = false;
		this.towCap = 2.0;
	}

	@Override
	public boolean isPetrol() {
		// TODO Auto-generated method stub
		return petrol;
	}

	@Override
	public void move() {
		System.out.println("Car is driving");
		
	}

//	@Override
//	public boolean isAtv() {
//		// TODO Auto-generated method stub
//		return atv;
//	}

	@Override
	public double getTowingCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTowingCapacity(double towing) {
		// TODO Auto-generated method stub
		this.towCap = towing;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive(double miles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double drive(double miles, String location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void start() {
		System.out.println("Class C started");
	}

}
