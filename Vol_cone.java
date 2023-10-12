package com.basic;

import java.util.Scanner;

public class Vol_cone {
	
	public static void main (String[]args){
//		volume of cone is 1/3*(3.14*r*r*h)
		
		float volume,r,h;
		Scanner sv=new Scanner (System.in);
		System.out.println("Enter the values of radius and height: ");
		
		r=sv.nextFloat();
		h=sv.nextFloat();
		volume=1/3*(3.14f*r*r*h);
		
		System.out.println("Volume of this cone is: "+volume);
		
		
		
	}

}
