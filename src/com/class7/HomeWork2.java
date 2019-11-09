package com.class7;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*/*You need ask user to pay for coffee
          * You need to keep asking user to pay for it until
          * entered price is equal=5;
          * After user paid then say "Enjoy your coffee!"*/
		
		Scanner pay=new Scanner(System.in);
	    
	    int coffee=1;
	    
	    while(coffee<=4) {
	        System.out.println("Please pay for coffee");
	        if(coffee == 4) {
	            System.out.println("Enjoy your coffee");
	        }
	        coffee++;
	    }
	}

}
