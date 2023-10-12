package com.method;

import java.util.Scanner;

public class Addition_Method {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("\nEnter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=add2(a,b);
		System.out.println("\nAddition is: "+c);
	}
	
	static void	Add()
	{	
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("_______NO Parameter No Return______");
		System.out.println("\nEnter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		
		System.out.println("\nAddition is: "+c);
		
	}
	
	static void add1(int a, int b)
	{
		int c;
		System.out.println("_______With Parameter No Return______");
		c=a+b;
		System.out.println("\nAddition is: "+c);
		
	}
	
	static int add2(int a, int b)
	{
		int c;
		System.out.println("_______With Parameter with Return______");
		c=a+b;
		
		return c;
	}
	
	static int add3()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("_______no Parameter with Return______");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return c;
	}
}
