package com.cognixia.jump.corejava.flowcontrol;

import java.util.Scanner;

public class Iterations {

	public static void main(String[] args) {
		
		// while loop
		int count = 0;
		while(count < 10) {
			System.out.println("While loop: " + count);
			count++;
		}
		
		// do-while loop
		//count = 0;
		do {
			System.out.println("Do-While loop: " + count);
			count++;
		} while(count < 10);
		
		
		
		// using break and continue with while
		
		
		Scanner sc = new Scanner(System.in);
		
//		boolean stop = false;
//		int total = 0;
//		
//		while(!stop) {
//			
//			System.out.println("total = " + total);
//			System.out.println("Enter number:");
//			
//			int num = sc.nextInt();
//			sc.nextLine();
//			
//			if(num == 0) {
//				stop = true;
//				System.out.println("final total = " + total);
//			}
//			else if ( (Math.abs(num) > total) && (num < 0) ) {
//				continue;
//			}
//			else if (num > 100) {
//				System.out.println("Number's too big, breaking out");
//				break;
//			}
// 			
//			total = total + num;
//		}
		
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			sum += num;
		}
		System.out.println("sum = " + sum);
		
		
		
		sc.close();
		
		
		
		
		
		
	}
}