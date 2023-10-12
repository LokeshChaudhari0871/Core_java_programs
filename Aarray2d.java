package com.arrays;

import java.util.Scanner;

public class Aarray2d {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int a[][] = new int[5][5];
				
				System.out.println("Enter the numbers for matrix");
				
				for(int i=0; i<=4 ; i++)
				{
					for(int j=0; j<=4 ; j++)
					a[i][j]=sc.nextInt();
				}
				
				for(int i=0; i<=4 ; i++)
				{
					for(int j=0; j<=4 ; j++)
					{
						System.out.print("  "+a[i][j]);
					}
				   
					 System.out.println();
					
		         }
		         
		         
	}
	
}