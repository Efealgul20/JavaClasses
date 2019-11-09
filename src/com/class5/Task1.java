package com.class5;

public class Task1 {

	public static void main(String[] args) {
		/*
	 * Write a program that will print whether it is a weekend or weekday. If any
	 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
	 * weekend”, any other day → output “Invalid day”
	 */

	int day=7;

	if(day==6||day==7)
	{
		System.out.println("It's a weekend");

	}else if(day==1||day==2||day==3||day==4||day==5)
	{
		System.out.println("It's a weekday");
		
	}else {
		System.out.println("Invalid day");
	}
		
	}
}

