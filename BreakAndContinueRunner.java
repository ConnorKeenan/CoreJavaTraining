package com.cognixia.jump.corejava.flowcontrol;

import java.util.Scanner;

public class BreakandContinueRunner {
	
	public static void main(String[] args) {
//		breakAndContinue();
//		find17();
		System.out.println(runScanner());
	}
	
	public static void breakAndContinue() {
//		Printing out the odd numbers, one to 10.  This loop goes to 100, but we will end it early.
		for (int i = 0; i < 100; i++) {
			if (i%2 == 0) {
				continue;
			} else if (i > 10){
				break;
			}
//			This print out will be skipped by the continue statement above for all even numbers.
			System.out.println(i);
		}
	}
	
	public static int find17() {
		
//		AS return statement will also end a for loop, because any memory associated with the method 
//		will be cleared on completion
		for (int i = 20; i < 100; i++) {
			if (i%17 ==0) {
				return i;
			}
		}
		
		return 0;
	}
	
	private static String runScanner() {
//		We will be using a while loop to check for a valid input.
		Scanner scan = new Scanner(System.in);
		String str = null;
//		This loop will run continuously, so we must manually break out of the loop.
		while(true) {
			System.out.println("Please enter only one character, or '0' for null");
//			The nextLine method captures the entire line of code
			str = scan.nextLine();
			if (str.length() > 1) {
				System.out.println("You entered more than one character");
//				If the user entered more than one character, 
				continue;
			}
			
			if (str.equals("0")) {
//				Zero is our null condition, so we can end the loop here.
				break;
			}
			scan.close();
//			With our input in the required state, we can return the string and break the loop
			return "You entered: " + str;
			
		}
		scan.close();
//		The null return is the default in this case, and can only be reached by hitting the break condition.
		return null;
	}

}