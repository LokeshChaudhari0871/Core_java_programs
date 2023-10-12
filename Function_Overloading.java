package com.classes;

import java.util.Scanner;

class Addition1
{
	void add(int a ,int b)
	{
		System.out.println("additon is "+(a+b));
	}
	void add (float a, float b )
	{
		System.out.println("Addition is "+(a+b));
	}
	void  add (int a, float b)
	{
		System.out.println("Addition is "+(a+b));
	}
	void  add (double a, double b)
	{
		System.out.println("Addition is "+(a+b));
	}
}



public class Function_Overloading {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int a , b;
		float c,d;
		Addition1 a1=new Addition1();
		a1.add(10, 20);
		a1.add(10.2f, 20.56f);
		a1.add(20, 22.4f);
		
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		a1.add(a,b);
		 
	}

}
