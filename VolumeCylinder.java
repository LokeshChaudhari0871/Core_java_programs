package com.basic;

import java.util.Scanner;

public class VolumeCylinder {
		
	 public static void main (String[]args){
//		 volume of cylinder: v=2*(3.14)*r*r
		 
		 float v,r;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of radius: ");
		 r=sc.nextFloat();
		 v=2*3.14f*r*r;
		 
		 System.out.println ("Volume of this cylnder is: " +v);
		 
		 
	 }
	   
}
