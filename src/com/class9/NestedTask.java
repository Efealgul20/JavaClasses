package com.class9;

public class NestedTask {

	public static void main(String[] args) {
		
	    for(int a=0; a<10; a++) {
	    	
	        for( int b=0; b<10; b++) {
	        	
	            for(int c=0; c<10; c++) {
	                
	                for(int d=0; d<10; d++) {
	                	
	                    for(int e=0; e<10; e++) {
	                    	
	                        System.out.println(a+""+ b+""+c+""+ d +""+e);
	                        
	                    }
	                }
	            }
	        }
	    }
	}
}