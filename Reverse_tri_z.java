package com.loops;

public class Reverse_tri_z {
		public static void main(String[]args){
			
			int i,j,n=90;
			for (i=1;i<=5;i++){
				n=90;
				for(j=5;j>=i;j--){
					
					System.out.print((char)n);
					n--;
				}
				System.out.println();
			}
			
			for (i=1;i<=5;i++){
//				n=90;
				for(j=5;j>=i;j--){
					
					System.out.print((char)n);
					n--;
				}
				System.out.println();
			}
		}
}
