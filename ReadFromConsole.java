package com.cognixia.jump.salesforce;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		// Single Line Comment
		
		/* put anything in here
		  make it as many lines as you want
		 multi line comments
		*/
		
		// primitive data types
		int ourInt = 7;
		
		ourInt = 5;
		

		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		String prompt = "Please enter a number: ";
		System.out.println(prompt);
		
		//read from console
		String fromConsole = input.nextLine();
		
		//output input
		System.out.println(fromConsole + 5);
		
		//close the scanner
		input.close();
		
	}

}
