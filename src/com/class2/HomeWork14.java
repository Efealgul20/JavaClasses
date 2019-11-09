package com.class2;

public class HomeWork14 {
	/*
	 * Instructions from your teacher:
There are 5 basic arithmetic operators:
Addition, +
Subtraction, -
Multiplication, *
Division, /
Modulus, %
The one you may not be familiar with is modulus, which returns the remainder after division.
6 % 4 = 2   --> 6/4 = 1 so 6-(4*1) = 2
11 % 5 = 1  --> 11/5 = 2 so 11-(5*2) = 1
A useful modulus equation is:
num % 2
This equation is useful in determining whether num is even or odd. If the result of the equation above is 0 the num is even. If not, the num is odd.
Instructions:
Add the values of num1 and num2 and then subtract num3 from the result and store it in result1
Multiply num4 and num5 together and then divide num6 from the result and store it in result2
Print following statement:
_______ modded by _______ is ______
result2           result1    blank3
where blank3 is the remainder of result1 into result2
	 */
	
	public static void main(String[] args) {
		
	    int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int result1=num1+num2-num3;
	    int result2=num4*num5/num6;
	    int mod=result2%result1;
	    int remainder=result1%result2;
	    		
	    System.out.println(result2 +"modded by" +result1+ "is" +remainder);
	    
	    
	}

}
