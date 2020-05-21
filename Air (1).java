package com.cognixia.jump.salesforce.enums;

import java.util.HashMap;
import java.util.Map;

public enum Air implements Labeled{
//	Initializing the enum values, along with the data members that will be associated with them 
	N2  ("Nitrogen", 28.012, 78.084), 
	O2  ("Oxygen", 31.998, 20.946), 
	AR  ("Argon", 39.792, 0.9340), 
	C02 ("Carbon Dioxide", 44.01, 0.04133);
	
	
//	Creating memory locations for the data members
	public final String name;
	public final double weight;
	public final double percent;
	
//	These hashmaps are what will be used for a custom implementation of searching the enum
//	by values other than the element symbols
	private static final Map<String, Air> BY_NAME = new HashMap<>();
	private static final Map<Double, Air> BY_WEIGHT = new HashMap<>();
	private static final Map<Double, Air> BY_PERCENT = new HashMap<>();
	
//	This static block will run once the elements have been instantiated, and will add their
//	associated data members to the proper hashmaps
	static {
		for (Air a : values()) {
			BY_NAME.put(a.name, a);
			BY_WEIGHT.put(a.weight, a);
			BY_PERCENT.put(a.percent, a);
		}
	}
	
//	Enums are objects that are created for each value, so this constructor will run 
	private Air(String name, double weight, double percent) {
		this.name = name;
		this.weight = weight;
		this.percent = percent;
		
	}
	
	public static Air getByName(String name) {
		return BY_NAME.get(name);
	}
	
	public static Air getByWeight(double weight) {
		return BY_WEIGHT.get(weight);
	}
	
	public static Air getByPercent(double percent) {
		return BY_PERCENT.get(percent);
	}

	@Override
	public String label() {
		// TODO Auto-generated method stub
		return name;
	}
	

	
}
