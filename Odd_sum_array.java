package com.arrays;

import java.util.Scanner;

public class Odd_sum_array {
	public static void main(String[] args) 
	{
	
				Scanner sc=new Scanner (System.in);
				int a[]=new int[5],evensum=0;
				System.out.println("Enter 5 number ");
	
					for(int i=0; i<=4;i++){
						a[i]=sc.nextInt();
					}

	
					for(int i=0; i<=4;i++){
						if(a[i]%2==0)
						{
							evensum=evensum+a[i];
						}
					 
					}
						System.out.println("Sum of all even number in this array is: "+evensum);
					}
				
		}

	

