package com.arrays;

import java.util.Scanner;

public class Sum_of_2d_array {
	public static void main (String []args)
	{
		  Scanner sc=new Scanner (System.in);
		  int sub1[][] =new int [3][3];
		  int sub2[][] =new int [3][3];
		  System.out.println("Enter marks for sub 1: ");
		  
		  for (int i=0;i<=2; i++)
		  {
			  for (int j=0 ; j<=2; j++)
			  
				  sub1[i][j] = sc.nextInt();
			  }
			  
			  for (int i=0;i<=2; i++)
			  {
				  for (int j=0 ; j<=2; j++)
				  {
					 System.out.print(" "+sub1[i][j]);
				  }
			  System.out.println();
			  
		  }
			  System.out.println("Enter marks for sub2: ");
			  
			  for (int i=0;i<=2; i++)
			  {
				  for (int j=0 ; j<=2; j++)
				  
					  sub2[i][j] = sc.nextInt();
				  }
				  
				  for (int i=0;i<=2; i++)
				  {
					  for (int j=0 ; j<=2; j++)
					  {
						 System.out.print(" "+sub2[i][j]);
					  }
				  System.out.println();
			  
				}
				  
				int sum[][]= new int [3][3];
				
				for  (int i=0 ; i<=2 ;i++)
				{
					 for (int j=0 ; j<=2; j++)
					 {
						sum[i][j]=sub1[i][j]+sub2[i][j];
					 }
				}
				System.out.println();
					 
					 for(int i = 0; i<=2;i++)
					 {
						 for(int j= 0;j<=2 ; j++)
						 {
							 System.out.print("  "+sum[i][j]);
					 }
						 System.out.println();
					 
					 
			}		
					 
	 }
	
}






