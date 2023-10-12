package com.ifelse;

import java.util.Scanner;

public class Gretternum {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the number a and b: \n");
		
		Scanner sv=new Scanner(System.in);
		a=sv.nextInt();
		b=sv.nextInt();
		
		if(a>b){
			System.out.println("a is Gretter than b \n");
		}
		else if (b<a){
		   System.out.println("b is greater than a \n");
		  
	    }
		else{
			System.out.println("a and b is Equal");
		}
	}
}
