package com.class4;

public class Task2 {

	public static void main(String[] args) {
		
		double rate=3.5;
		double price=200000;
		
		if (rate>=4.5) {
			System.out.println("I'm not buying the house");
			}else {
				System.out.println("I'll consider buying the house");
				
				if (price>2000000) {
					System.out.println("I'll need a loan to buy house");
					}else {
						System.out.println("I'll pay cash for my house");
						}
		}

	}

}
