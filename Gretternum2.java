package com.ifelse;

import java.util.Scanner;

public class Gretternum2 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the number a, b and c: \n");
		
		Scanner sv=new Scanner(System.in);
		a=sv.nextInt();
		b=sv.nextInt();
		c=sv.nextInt();
		if(a>b && a>c){
			System.out.println("a is Gretter than b and c \n");
		}
		else if (b>a && b>c){
		   System.out.println("b is greater than a and c \n");
		  
	    }
		else if(c>a && c>b) {
			System.out.println("c is greatter than a and b");
		}
		else{
			System.out.println(" a, b and c is Equal");
		}
	}
}
