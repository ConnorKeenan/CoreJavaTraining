package com.cognixia.jump.salesforce.enums;

public enum Cake {
	ICE_CREAM("Graham Cracker"), CHOCOLATE("Chocolate Custard"), VANILLA ("Fresh Strawberries");

	public final String filling;

	Cake (String filling){
		this.filling = filling;
	}

}
