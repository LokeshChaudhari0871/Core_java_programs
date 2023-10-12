package com.method;

import java.util.Scanner;




public class No_para_noreturn {

		public static void main(String[]args)
		{
			No_para_noreturn a=new No_para_noreturn();
			a.Average();
		}
		 
		
		
		void add()
		{	
			System.out.println("Enter 2 Numbers: ");
			Scanner sc=new Scanner(System.in);
			int a,b,c;
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition is: "+c);
			
		}
		  
	  void area()
		  {
			  Scanner sc=new Scanner (System.in);
			  System.out.println("Enter radius: ");
			  int r;
			  float a ;
			  r=sc.nextInt();
			  a=3.14f*r*r;
			  System.out.println("Area is "+a);
		  }
	  
	  void Factorial()
	  {
		  Scanner sc =new Scanner (System.in);
		  System.out.println("Enter a number");
		  int n;
		  int f=1;
		  n=sc.nextInt();
		  for(int i=1;i<=n;i++)
		  {
			  f=i*f;
			  System.out.println("Factorial is: "+f);
		  }
	  }
	  
	  void Average()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter 3 numbers");
		  int a,b,c,avg;
		  a=sc.nextInt();
		  b=sc.nextInt();
		  c=sc.nextInt();
		  
		  avg=(a+b+c)/3;
		  System.out.println("Average is: "+avg);
	  }
}
