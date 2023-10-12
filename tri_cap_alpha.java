package com.loops;

public class tri_cap_alpha {
   public static void main (String[]args){
	   
	   
	   int i,j,n=65;
	    
		for(i=1;i<=5;i++){ //Outer row
			for(j=1;j<=i;j++){ //Inner col
				System.out.print((char)n);
				n++;
			}
			
			System.out.println();
		
	}
		for(i=1;i<=5;i++){ //Outer row
			for(j=5;j>=i;j--){ //Inner col
				System.out.print((char)n);
				n++;
			}
			
			System.out.println();
}
}
}
	  
