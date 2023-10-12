package com.arrays;

import java.util.Scanner;

public class Add_two_array1 {

		public static void main(String[] args) 
		{
		
			Scanner sc = new Scanner(System.in);
			int array1[]= new int[5],sum=0;
			int array2 [] = new int [5],sum2=0,sum3=0;
		
			System.out.println("Enter 5 no. ");
			
			for(int i=0;i<=4;i++){
				array1[i]=sc.nextInt();
			}
			for(int i=0;i<=4;i++){
				sum=array1[i]+sum;
			
			}
		 	System.out.println("Sum is "+sum);
		
		 	
		 	
		 	
		 	
		 	
		 	System.out.println("Enter array 2 ");
		 	
		 		for(int j=0; j <= 4; j++){
		 			array2[j]=sc.nextInt();
		 		}
			
		 		for(int j=0;j<=4;j++){
		 			sum2 = array2[j]+sum2;
					
		 		}
		 		
		 		System.out.println("Sum of array 2 : "+sum2);
			
			
		 			sum3=sum+sum2;
			
		 			System.out.println("Sum of array1 and array2 is: "+sum3);
			
		}
	}

