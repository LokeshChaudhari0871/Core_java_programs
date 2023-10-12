package com.loops;

import java.util.Scanner;

public class Sum_of_odd_num {
//
//	public static void main(String[] args) {
//			
//			int i,n,sum = 0;
//			
//			Scanner sc=new Scanner (System.in);
//			System.out.println("Enter the number ");
//			n = sc.nextInt();
//			
//			for(i=0;i<=n;i++);
//			
//			if((i%2)==1)
//			{
//			  sum+=i;
//			  
//			}
//			System.out.println("The sum is "+sum);
//	}
//
//}
	 public static void main(String args[]) {
	        int N, i, sum = 0;
	 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        N = sc.nextInt();
	 
	        for(i = 0; i <= N; i++){
	            if((i%2) == 1){
	                sum =sum +i;
	            }
	            System.out.print("\nSum of all odd numbers is \n" + sum);
	        }
	     
	    }
	}
	
