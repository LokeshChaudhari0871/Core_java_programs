package com.arrays;

import java.util.Scanner;

public class Reverse_array {
	public static void main (String[]args){
		 
		Scanner sc=new Scanner (System.in);
	        int a[]=new int[5];
	        System.out.println("Enter 5 number ");
	    	
	        for(int i=0; i<=4;i++){
	    		a[i]=sc.nextInt();
	    	}
		
	    	
	    	for(int i=4; i>=0;i--){
	    		System.out.println(a[i]);
		}	
	}
}

	



