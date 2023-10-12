package com.inheritance;

import java.util.Scanner;

class Area
{
	float area;
	Scanner sc= new Scanner(System.in);
}	


class Circle extends Area
{
		Circle ()
		{
			int r;
			System.out.println("Enter radius: ");
			r=sc.nextInt();
			area = 3.14f*r*r;
			System.out.println("Area of  this circle is: "+area);
		}
 }
	
 class  Rect extends Area
 {
	Rect() 
	{
		int l;
		int b;
		System.out.println("\nEnter length and breadth: ");
		l=sc.nextInt();
		b=sc.nextInt();
		area = l*b;
		System.out.println("Area of this Rectangle is: "+area);
	}
}

public class Hierarchical_In {

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Rect r=new Rect();
		
	
			
	}

}
