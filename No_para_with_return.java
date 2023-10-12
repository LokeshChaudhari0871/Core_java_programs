package com.method;

import java.util.Scanner;

public class No_para_with_return {
	public static void main (String[]args)
	{
		int a,b,c,n,r,Fact=1;
		float arr;
		
		arr = AreaCircle();
//		System.out.println("Addition of two numbers is: "+c);
//		System.out.println("Subtraction of two numbers is: "+c);
//		System.out.println("Average of two numbers is: "+c);
//		System.out.println("Factorial of number is: "+Fact);
		System.out.println("Area of this circle is : "+arr);
			
	}
	
	static int  addition3()
	{
		 Scanner sc=new Scanner (System.in);
		 int a,b;
		 int c,Fact;
		 System.out.println("Enter two numbers: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
	 
		 Fact=a+b;
		 return Fact;
	 
	}
	
	static int substraction3()
	{
		 Scanner sc=new Scanner (System.in);
		 int a,b;
		 int c;
		 System.out.println("Enter two numbers: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
	 
		 c=a+b;
		 return c;
	 
	}
	
	static int avg3()
	{
		Scanner sc=new Scanner (System.in);
		int a,b;
		int c;
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=(a+b)/2;
		return c;
		
	}
	
	static int Factorial()
	{
		Scanner sc=new Scanner (System.in);
		int n;
		int Fact=1;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		   Fact = i*Fact;
		}
		return Fact;
		
	}
	
	static float AreaCircle()
	{
		Scanner sc=new Scanner (System.in);
		int r;
		float arr;
		System.out.println("Enter radius of this circle: ");
		r=sc.nextInt();
		arr= 3.14f*r*r;
		
		return arr;
	}
}
