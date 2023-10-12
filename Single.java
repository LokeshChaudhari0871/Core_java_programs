package com.inheritance;

import java.util.Scanner;
class Add
{
	Scanner sc= new Scanner (System.in);
	void input()
	{
		int a,b,c;
		System.out.println("Enter number a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c = a + b;
		System.out.println("Addition is: "+c);
	}
	
}

class Sub extends Add
{
	Scanner sc=new Scanner (System.in);
	void input2()
	{
		int a,b,c;
		System.out.println("Enter number a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c = a - b;
		System.out.println("Substraction is: "+c);
		
	}
}

public class Single 
{
	

	public static void main(String[] args)
	{
		Sub s =new Sub(); 
		s.input2();
		s.input();
		

	}

}
