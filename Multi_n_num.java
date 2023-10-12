package com.loops;

import java.util.Scanner;

public class Multi_n_num {

	
		public static void main(String[]args){
			int i,n,m=1;
			
			Scanner sc=new Scanner (System.in);
			System.out.print("Enter the number: ");
			
			
			n=sc.nextInt();
			for(i=1;i<=n;i++){
				
					m=m*i;
				
				}	

				
					
				m=m*i;
				
			
			System.out.println("Multiflication till given number is : "+m);
		}
}
