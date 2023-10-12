package com.loops;

public class Reverse_right_tri {
	
	public static void main(String[]args){
		int i,j;
      for(i=1;i<=5;i++){ //Outer row
			
			for(j=5;j>=i;j--){ //Inner col
				System.out.print("*");
			}
			System.out.println("");
		
	}
	}

}
