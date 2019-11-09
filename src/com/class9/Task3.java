package com.class9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/* Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 */
		Scanner scan=new Scanner(System.in);
	    int b;
	    int a;
	    
	     b=15;
	     System.out.println("enter a number between 1 and 20");
	     
	    do {
	        
	        
	        a=scan.nextInt();
	        if(a>b) {
	            
	            System.out.println("your number is too large");}
	        else {
	            System.out.println("it is smaller than secret number");   
	        
	    }while(a!=b);
	    
	    System.out.println("you won!!!");
	    }
	}
}
