package com.basic;

import java.util.Scanner;

public class Circumferance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float r,circumferance;
		System.out.println("What is the radius of circle: ");
		
		r=sc.nextFloat();
		circumferance= 2*(3.14f*r);
		System.out.println("Cicumferance of this circle is: "+circumferance); 
		
		

	}

}
