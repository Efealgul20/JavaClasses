package com.class4;

import java.util.Scanner;

public class Task5Temperature {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your city");
		String city=scan.nextLine();
		
		Scanner temp=new Scanner(System.in);
		System.out.println("Please enter temperature");

		int fahr=temp.nextInt();
		double cels=((fahr-32)/1.8);
		System.out.println("The temperature of "+city+" is "+cels);
		}
	}