package com.arrays;

import java.util.Scanner;

public class Attay1D_sum {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int  a[]= new int [5];
		System.out.println("Enter 5 numbers");
		
		for (int i=0;i<=4;i++)
		{
		
				a[i]=sc.nextInt();
		
		}
			int sum=0;
		for (int i=0;i<=4;i++)
		{
				sum=a[i]+sum;
		}
			System.out.println(" "+sum);	
		
		
	
	}

}
