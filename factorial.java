package com.loops;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i=1 ,f=1 ,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
	
		
		for (i=1; i<=n; i++){
			f=i*f;
			System.out.println("Factorial is: "+f);
		}
		

	}

}
