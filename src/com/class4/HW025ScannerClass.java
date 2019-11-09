package com.class4;

import java.util.Scanner;

public class HW025ScannerClass {
	/*
	 * For you to do: Create a Scanner class
	 * 
	 * Create a program that will take a boolean value from a user. If the input is
	 * True or False, then the output should look like below:
	 * 
	 * First Output: "Input the boolean value"
	 * 
	 * Final Output: "The value is ______"
	 */

	public static void main(String[] args) {

		boolean bool1;
		Scanner in = new Scanner(System.in);
		System.out.println("Input boolean value");
		bool1 = in.nextBoolean();
		System.out.println("The value is " + bool1);
	
	}
}
