package com.arrays;

import java.util.Scanner;

public class Array_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
			int array[]=new int[5],t;
			System.out.println("Enter 5 numbers: ");
			
			for(int i=0; i<=4; i++)
			{
				array[i]=sc.nextInt();
				
			}
			//-----sort-----
				for(int i=0;i<=4;i++){
					 for(int j=0;j<=3;j++){
						 
						 if(array[j]>=array[j+1])
						 {
							 t=array[j];
							 array[j]=array[j+1];
							 array[j+1]=t;
						 }
						
					 }
					
				}
			
			
			for(int i=0; i<=4 ; i++)
			{
				System.out.println(array[i]);
			}

	}

}
