package com.class2;

public class HomeWork11 {
	/*
	 * Instructions from your teacher:
For you to do:
1. Create a class Main and create a main method.
2. Write a program to print the perimeter and area of a rectangle with width = 5 and  height = 8. 

Output:
“The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __”
	 */
	
	public static void main(String[] args) {
		int width=5;
		int height=8;
		
		int area=width*height;
		int perimeter=2*(width+height);
		
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equals to "+perimeter+" and the area equals to "+area);
		
		
	}

}
