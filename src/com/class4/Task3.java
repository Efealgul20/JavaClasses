package com.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args, Object keyboard) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("Please enter first amount of loan");
		int num1 = keyboard1.nextInt();

		System.out.println("Please enter second amount of loan");
		int num2 = keyboard1.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2 + "reject");
		} else {
			System.out.println(num1 + " is smaller than " + num2 + "lend the money"); 
			}
	}
}

