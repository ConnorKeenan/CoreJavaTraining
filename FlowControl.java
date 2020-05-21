package com.cognixia.jump.salesforce;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {

		// create scanner object
		Scanner input = new Scanner(System.in);

		// prompt user for input
		String prompt = "Please enter a number: ";
		System.out.println(prompt);

		// read from console
		int fromConsole = input.nextInt();

		// output input
		System.out.println(fromConsole);

		// Conditional eg 1

		boolean test = fromConsole < 10 && fromConsole >= 0;
//		if (test) {
//
//			System.out.println("You're in the target range.");
//
//			if (fromConsole % 2 == 0) {
//				System.out.println("You're even");
//			}
//			
//			else System.out.println("You're odd.");
//
//		}
//		
//		else {
//			System.out.println("You're out of range");
//		}
//
//		String string = "String";
//		char a = 'a';
//
//		switch (fromConsole) {
//		case 1:
//			System.out.println("Main Menue");
//			break;
//
//		case 2:
//			System.out.println("User Settings");
//			break;
//
//		default:
//			System.out.println("No input match");
//
//		}
		
		// Looping Demo
		Scanner input2 = new Scanner(System.in);
//		System.out.println("Enter your word:");
//		String consoleWord = input2.nextLine();
		
		//While loop
//		while(!consoleWord.equals("Exit")) {
//			System.out.println("We're looping. Enter new word: ");
//			consoleWord = input2.nextLine();
//		}
		
		// do While Loop
//		do {
//			System.out.println("We're looping. Enter new word: ");
//			consoleWord = input2.nextLine();	
//		} while (!consoleWord.equals("Exit"));
		
		// For Loop and Nest For Loops
		for (int i = 0; i < 10; i++) {
			
//			if (i == 2) return;
			
			for (int j = 10; j >=0; j--) {
				System.out.println("i = " + i + " j = " + j);
				if (j == 4) return;
			}
			
		}

		// close the scanner
		input.close();
		input2.close();

	}

}
