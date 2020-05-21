package com.cognixia.jump.salesforce.enums;

public enum Grade {

	FRESHMAN, SOPHMORE, JUNIOR, SENIOR;
	
//	AN Enum's constructor is run once for each value.  This statement will print for each grade
	Grade() {
		System.out.println("A " + this.toString() + " has been in high school for "
				+ (this.ordinal() + 1) + " year(s)");
	}
	
//	This method is available to all enums of this type
	public void hello() {
		System.out.println("Hello this student is a " + this.toString());
	}
	
}
