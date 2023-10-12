package com.loops;

import java.util.Scanner;

public class Sumtilln {

	public static void main(String[] args) {
		int i, n,s=0;
		  Scanner sv=new Scanner (System.in);
		  System.out.println("Enter the number");
		  
		  n=sv.nextInt();
		  
		  for(i=0; i<=n; i++)
		  {
			  s=s+i;
		  }
		  System.out.println("Sum is:  "+s);
     }
}
