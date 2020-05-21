package com.cognixia.jump.salesforce.classesObjects;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		// String Pool and assigning strings in memory
		
		String s1 = "s1";  // This makes a String object in the pool
		String s2 = "s2";  // "
		String s3 = "s1";  // Does not make a new String object
		
		byte[] bytes = { 1, 2, 3, 4};
		
		String s4 = new String(bytes);
		
		System.out.println(s4);
		
		System.out.println(s1 == s4);
		
		// Check for equality of strings
		System.out.println(s4.equals(s1));
		
		// Look at String instance methods
		String demo = " Salesforce core Java ";
			// substring
			String sub = demo.substring(4);
			String sub2 = demo.substring(4, 7);
			
			System.out.println(sub + "||" + sub2);
		
			// trim and strip
			demo = demo.strip();
			System.out.println(demo);
		
			// indexOf
			System.out.println(demo.indexOf(' '));
			
			System.out.println(demo.indexOf("core"));
		
			// charAt
			System.out.println(demo.charAt(11));
		
		// String Static methods
			// Value of does conversion
			char[] charArray = {'H', 'e', 'l', 'l', 'o'};
			String conv = String.valueOf(charArray);
			
			String num = String.valueOf(2.60);
			String num2 = String.valueOf(5.0);
			
			System.out.println(Arrays.toString(charArray));
			System.out.println(num + num2);
		
		// iterating through Strings
			
			for (int i = 0; i < demo.length(); i++) {
				char [] temp = demo.toCharArray();
				System.out.println(demo.toCharArray()[i]);
			}
		
		// String Builder and String Buffer
			StringBuilder build = new StringBuilder(demo);
			StringBuffer buff = new StringBuffer(demo);
			
			System.out.println(build.reverse().toString());
		
		// Pass by value
		
		String one = new String("1");
		String two = new String("2");
		
		stringCheck(one, two);
		
//		System.out.println(one + " " + two);

	}
	
	public static void stringCheck(String one, String two) {
		one = new String("3");
		
		
	}

}
