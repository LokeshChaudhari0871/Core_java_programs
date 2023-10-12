package com.classes;

import java.util.Scanner;

class Average
{
	void avg( int a ,int b)
	{
		System.out.println("Average is "+((a+b)/2));
	}
	void avg (float a, float b )
	{
		System.out.println("Average is "+((a+b)/2));
	}
	void avg (float a, int b )
	{
		System.out.println("Average is "+((a+b)/2));
	}
}

//a1.add(12,43);
public class Average_Over {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int a, b;
		float c,d;
		int e; float f;
		
		Average a1 =new Average();             // calling the class
		System.out.println("Enter 2 int Numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		a1.avg(a,b);
		
		Average a2 =new Average();
		System.out.println("Eneter 2 float Numbers ");
		c=sc.nextFloat();
		d=sc.nextFloat();
		a2.avg(c,d);
		
		Average a3 =new Average();
		System.out.println("Enter 1 int number and 1 float number ");
		e=sc.nextInt();
		f=sc.nextFloat();
		a3.avg(e,f);
	}

}
