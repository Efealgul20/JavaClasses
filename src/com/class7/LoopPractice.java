package com.class7;

public class LoopPractice {
	public static void main(String[] args) {
	int b=50;
	while (b>=20) {
		System.out.println(b);
		b--;
		
	}
	System.out.println("--------------");
	//I want to print 
	System.out.println("******************");
	//Print only odd number from 50 to 100
	//print only even numbers from 100 to 1
	int c=50;
    while(c<100) {
        if(c%2==1) {
            System.out.println(c);
        }c++;
        }
    System.out.println("&&&&&&&&&&&&");
    
    while (c>1) {
        if(c%2==0) {
            System.out.println(c);
        }c--;
    }
	}
}


