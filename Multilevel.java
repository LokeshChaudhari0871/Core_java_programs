package com.inheritance;

import java.util.Scanner;

class Add1
{
	Scanner sc= new Scanner (System.in);
	void input()
	{
		int a,b,c;
		System.out.println("Enter number a and b Addition: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c = a + b;
		System.out.println("Addition is: "+c);
	}
	
}

class Sub1 extends Add1
{
	Scanner sc=new Scanner (System.in);
	void input2()
	{
		int a,b,c;
		System.out.println("Enter number a and b for Substraction: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c = a - b;
		System.out.println("Substraction is: "+c);
		
	}
}

class Avg extends Sub1
{
	void input3()
	{
		int a,b,c;
		System.out.println("Enter number a and b for average: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c = (a+b)/2;
		System.out.println("Average is: "+c);
	}
}
	public class Multilevel 
	{
		public static void main(String[]args)
		{
	
			Avg a= new Avg ();
			a.input();
			a.input2();
			a.input3();
		}	
	}
