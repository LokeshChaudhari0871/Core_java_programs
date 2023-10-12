package com.arrays;

import java.util.Scanner;

public class Min_number_array {
		
public static void main(String[]args){
		
		Scanner sc=new Scanner (System.in);
		int marks[]=new int[5],min;
		System.out.println("Enter marks of 5 student ");
		
		for(int i=0;i<=4;i++){
			
			marks[i]=sc.nextInt();
			 if(marks[i]>100)
				{
					System.out.println("Invalid");
					break;
					
				}
				
		}
		min=marks[0];
		for(int i=0;i<=4;i++)
		{
			
			if(marks[i]<min)
			{
				min=marks[i];
				
			}
				
		}
		System.out.println("Worst student of this class is passed with: " +(min)+ " %");
		
		
	}
}

