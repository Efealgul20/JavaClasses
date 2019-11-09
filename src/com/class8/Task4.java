package com.class8;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	    
	    for(int i=1; i<=10; i++) {
	        System.out.println("Apply for credit");
	        String answer=scan.next();
	        if(answer.equals("yes")) {
	            break;
	        }
	    }

	}

}
