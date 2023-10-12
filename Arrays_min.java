package com.arrays;
import java.util.Scanner;
public class Arrays_min 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int min;
		
		System.out.println("Enter 9 numbers");
		
		int a[][]=new int[3][3];
		
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		 min =a[0][0];
		 
		 for (int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					if(min>a[i][j])
					{
						min=a[i][j];
					}
					System.out.println("");
					
				}
			}
		 System.out.println(min);
		
	}
}
