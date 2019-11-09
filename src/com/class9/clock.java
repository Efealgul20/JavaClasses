package com.class9;

public class clock {

	public static void main(String[] args) {
		        /* 24hrs, 60mins every hr
		         *
		         */
		        for (int hr=0; hr<12; hr++) {
		            for (int min=0; min<60;min++) {
		                if(min<10) {
		                    System.out.println(hr+":"+"0"+min);
		                    
		                }else {
		                System.out.println(hr+":"+min);
		            }
		            }
		        }
		    }
}
