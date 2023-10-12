package com.loops;

import java.util.Scanner;

public class Do_while_avg {

	public static void main(String[] args) {
		int a , b , c;
		char ans;
		Scanner sc=new Scanner (System.in);
		
		do{
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			
		
			c = (a+b)/2; 
			System.out.println("Average of this two numbers is: "+c);
			System.out.println("Do you want to continue? ");
			ans =sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		
}
}