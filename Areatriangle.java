package com.basic;

import java.util.Scanner;

public class Areatriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		float a,b,h;
		System.out.println("write base and height of the traingle");
		
		b=sc.nextFloat();
		h=sc.nextFloat();
		a=(float) (0.5*(b*h));
		System.out.println("Area of this triangle is: ");

	}

}
