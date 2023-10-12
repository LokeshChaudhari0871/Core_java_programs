package com.arrays;

import java.util.Scanner;

  public class Array_Search
  {
	  
	    public static void main(String[]args)
	    {
	        Scanner sc=new Scanner (System.in);
	        int a[]=new int[5],n,count =0;
	        System.out.println("Enter 5 number ");
	    	for(int i=0; i<=4;i++){
	    		a[i]=sc.nextInt();
	    	}
	    	System.out.println("Enter a number to search");
	    	n=sc.nextInt();
	    	for(int i = 0; i<=4 ; i++)
	    	{
	    		if(a[i]==n)
	    		{
	    			count++;
	    			System.out.println("Found at " +(i+1)+ " position");
	    			
	    		}
	    	}
	    	System.out.println("Count is: " +count);
	    	
	    }
	    
}
