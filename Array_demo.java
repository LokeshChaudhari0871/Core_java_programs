package com.arrays;

import java.util.Scanner;

public class Array_demo {
	public static void main(String[]args){
	    
		
			Scanner sc=new Scanner(System.in);
			int marks[]= new int[12];
			System.out.println("Enter  5 no.");
		
			
			
			for(int i=0;i<=4;i++){
				marks[i]=sc.nextInt();
			}
			for (int i = 0; i<=4;i++){
			System.out.println(marks[i]);
		}
		}

	}
