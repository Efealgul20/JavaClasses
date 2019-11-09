package com.class5;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules:
		 * if the average score >=90 → grade=A
		 * if the average score >= 70 and <90 → grade=B
		 * if the average score>=50 and <70 → grade=C
		 * if the average score<50 → grade=F
		 *
		 * 2. Write a program to determine the classMode.
		 * If there is no rain → classMode=“In Class”, otherwise classMode → “Online”. */
		
		
		var students = ("David" == 80, "Vinoth" == 77, "Divya" == 88, "Ishitha" == 95, "Thomas" ==  68);

		var Avgmarks = 0;

		for (var i=0; i < students.length; i++) {
		        Avgmarks += students[i][1];
		        var avg = (Avgmarks/students.length);
		}

		console.log("Average grade: " + (Avgmarks)/students.length);

		        if (avg < 60){
		          console.log("Grade : F");      
		          } 
		        else if (avg < 70) {
		                console.log("Grade : D"); 
		                  } 
		        else if (avg < 80) 
		             {
		                console.log("Grade : C"); 
		        } else if (avg < 90) {
		                console.log("Grade : B"); 
		        } else if (avg < 100) {
		                console.log("Grade : A"); 
		        }
	}
		}
