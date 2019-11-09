package com.class2;

public class ArithmeticOperations {
/*
 * declare 2 variables and initialize them
 * perform addition, subtraction, multiplication and division
 */
	
	public static void main(String[] args) {
		int num1, num2;
		
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);	//30
		System.out.println(num1-num2);	//10
		System.out.println(num1*num2);	//200
		System.out.println(num1/num2);	//2
		
	//how can we print value of num1 and num2 together
		System.out.print(num1);
		System.out.print(" ");
		System.out.print(num2);
		System.out.print(num1+","+num2);
		
		int sum=num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
		
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		//the addition of 2 numbers is_
		System.out.println(sum);
        System.out.println("")
	}
	
}
