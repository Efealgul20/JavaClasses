package com.class5;

import java.util.Scanner;

public class LogiacalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age If age is from 1to 3 ---> you are a baby If age is from
		 * 3 to 5 ---->you are a toddler If age is from 5 to 12 --you are a kid If age
		 * is from 12 to 19 ---> you are a teenager If age is >20 ---> you are an adult
		 */

		int age;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		if (age >= 1 && age <= 3) {
			System.out.println("You are baby");
		} else if (age > 3 && age <= 5) {
			System.out.println("You are toddler");
		} else if (age > 5 && age <= 12) {
			System.out.println("You are a kid");
		} else if (age > 12 && age <= 19) {
			System.out.println("You are teenager");
		} else if (age > 20) {
			System.out.println("You are an adult");
		} else {
			System.out.println("Incorrect input");
		}
	}
}
