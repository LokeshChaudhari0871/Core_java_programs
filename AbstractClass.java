package com.inheritance;

import java.util.Scanner;

abstract class Shape
{
	float a;
	Scanner sc= new Scanner (System.in);
	abstract void area ();
	
}
class Circle_ extends Shape
{
	@Override
	void area()
	{
		float r;
		System.out.println("ENter radius: ");
		r=sc.nextFloat();
		a=3.14f*r*r;
		System.out.println("Area is: "+a);
		
	}
}

class Square extends Shape
{
	@Override
	public void area()
	{
		int s;
		System.out.println("Enter side : ");
		s=sc.nextInt();
		a= s*s;
		System.out.println("Area of Square is: "+a);
	}
	
}

public class AbstractClass {

	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		Square s1 = new Square();
		
//		Shape s1;
//		s1=c1
//				s1.area();
		
		
		
		
		

	}

}
