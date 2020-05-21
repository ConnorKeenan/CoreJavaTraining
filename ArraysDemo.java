package com.cognixia.jump.salesforce.classesObjects;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// Declaring an Array (primitives and objects)
		int[] intArray1;
		int intArray2[];
		
		
		Dog[] dogArray1;
		Dog dogArray2[];

		
		// Initializing an Array "
			// Method 1
		intArray1 = new int[5];
		dogArray1 = new Dog[3];
		
			// Method 2
			// invalid - must declare and initialize same time to use
		//intArray2 = {3, 7, 15, 24};
			//valid way, must declare / initialize same time
		int[] intArray3 = {3, 7, 15, 24};
		
		Dog[] dogArray3 = {new Dog(), new Dog()};
		
		
		// Access element in Array
			// primitives
//		System.out.println(intArray3[2]);
		
			// objects
//		System.out.println(dogArray3[1]);
//		System.out.println(dogArray1[2]);
		
		// Iterate through an Array
		
			// Traditional For loop
		for (int i = 0; i < intArray3.length; i++) {
//			System.out.println(intArray3[i]);
		}
		
		for (int i = intArray3.length -1; i >= 0 ; i-=2) {
//			System.out.println(intArray3[i]);
		}
		
			// For - Each Loop (Enhanced for loop)
			// primitives
		for (int x : intArray3) {
//			System.out.println(x);
		}
			// objects
		for (Dog dog : dogArray3) {
			dog.setBreed("For each");
//			System.out.println(dog);
		}
		
		// Multi dimension Arrays and how to iterate
		
		int[][] array = {
							{2,4,0},
							{5,6},
							{0}
							};
		
		int[][] twoDArray = new int[3][3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i][j]);
			}
		}
		
		// for each loop 2d array
		for (int[] is : array) {
			
			for (int is2 : is) {
				System.out.println(is2);
			}
//			System.out.println(Arrays.toString(is));
		}
		
		System.out.println("2D array length: " + array.length);
		
		// Array as objects and Arrays utility class
		
		System.out.println(Arrays.toString(dogArray3));

	}

}
