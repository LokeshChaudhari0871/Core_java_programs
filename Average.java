package com.basic;

import java.util.Scanner;

public class Average {
  
	 public static void main (String[]args){
		 
		 int a,b,Average;
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter a and b:  ");
		 
		 a=sc.nextInt();
		 b=sc.nextInt();
		 Average= (a+b)/2;
		 
		 System.out.println("Average of this two numbers is: "+Average);
		 
	 }
}
