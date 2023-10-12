package com.arrays;

import java.util.Scanner;

			public class Add_Two_array {
				public static void main (String[]args)
				{
					Scanner sc = new Scanner(System.in);
					int array1[]= new int[5];
					int array2 [] = new int [5];
	
					
					System.out.println("Enter 5 no. ");
					
					for(int i=0;i<=4;i++){
						array1[i]=sc.nextInt();
					}
					for(int i=0;i<=4;i++){
						System.out.println(array1[i]);
					
					}
				 	
						System.out.println("Enter array 2 ");
				 	
				 		for(int i=0; i <= 4; i++){
				 			array2[i]=sc.nextInt();
				 		}
					
				 		for(int i=0;i<=4;i++){
				 			System.out.println(array2[i]);
							
				 		}
		
									int array3[]=new int[5];
							
									for(int i=0;i<=4;i++)
							
									{
							
									array3[i]=array1[i]+array2[i]; 
									
									}
							
									System.out.println("SUM OF TWO ARRAY");
							
									for( int j=0;j<=4;j++)
									{
											System.out.println(array3[j]); 
							
								}
							
							}
							
			}
