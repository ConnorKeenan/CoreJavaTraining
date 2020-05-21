package com.cognixia.jump.corejava.flowcontrol;

import java.util.Scanner;

public class OperatorsRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Grade");
		int grade = scan.nextInt();
		
//		This outer condition checks a base case
//		The condition checks a non-inclusive less than condition
		if (grade < 70) {
			System.out.println("You did not pass.");
		} else {
			System.out.println("You passed!");
//			This inner conditional tree will only execute if the outer condition fails
//			This condition checks an exact case.
		    if (grade == 100) {
		    	System.out.println("You got a perfect score!");
		    	
//		    These conditionals check an inclusive greater than or equal to condition
			} else if (grade >= 91 ){
				System.out.println("You got an A!");
			} else if (grade >= 81) {
				System.out.println("You got a B!");
			} else if (grade >= 70) {
				System.out.println("You got a C.");
			}
		    
//		    This conditional checks two different conditions and only executes if *both* are true
		    if (grade > 53 && grade < 73) {
		    	System.out.println("You scored within the average range.");
		    }
		    
//		     This conditional checks two different conditions and executes if *at least one* is true
		    if (grade == 82 || grade == 95) {
		    	System.out.println("You got the same grade as one of your last exams.");
		    }
		    
//		    This conditional will execute in any condition where the value does not match the given value
		    if (grade != 95) {
		    	System.out.println("You did not get the same grade as your last exam.");
		    }
		}
		
		scan.close();
	}
	
}