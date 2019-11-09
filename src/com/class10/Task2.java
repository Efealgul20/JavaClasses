package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. Then print your name from that array.
		 * (use 2 different ways of creating an array).
		 */
		
		//String [] names=new String[3];
		
		//names[0]="Ali";
		//names[1]="Veli";
		//names[2]="Ayse";
		//names[3]="Esat";
		//names[4]="Ahmet";
		
	//	System.out.println(names[3]);
		

	System.out.println("---------------");
	// 2 way
		String[] animals= {"Cat", "Dog", "Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
			
		}
		
	}

}