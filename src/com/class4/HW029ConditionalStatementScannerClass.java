package com.class4;

import java.util.Scanner;

public class HW029ConditionalStatementScannerClass {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
For you to do: 
The variable "name" holds a String user input 
Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student

Hint: for your if condition use if(name.equals("Chen")) - we haven't study it yet, but this is code to compare Strings. We will cover this topic soon. 
		 */
		
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	If (name.equals("Chen")){
	  		System.out.println("teacher");
	  		}else {
	  			System.out.println("student");
	  	}
	  	
	}

}
