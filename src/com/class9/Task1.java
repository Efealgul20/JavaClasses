package com.class9;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern: 55555 4444 333 22 1  
		 */
		for (int a=1; a<6; a++) {
            for (int b=0; b<a; b++) {
            
            System.out.print("*");
        }
        System.out.println();
        }
        for (int a=4; a>0; a--) {
            for (int b=0; b<a; b++) {
            
            System.out.print("*");
        }
        System.out.println();
        }
	}
}
