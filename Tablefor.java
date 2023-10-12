package com.loops;

import java.util.Scanner;

public class Tablefor {
	public static void main(String[] args)
 {
	  int i=1, n,t;
	  Scanner sv=new Scanner (System.in);
	  System.out.println("Enter the number");
	  
	  n=sv.nextInt();
	 
	  for(i=1; i<=10; i++)
	  {
		  t=n*i;
		  System.out.println("Table: "+t);

}
}
}
