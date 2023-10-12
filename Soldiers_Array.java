package com.static_variable;

import java.util.Scanner;

class Soldier
{
	static String regiment ="Maratha Light Infantry";
	static String battalion ="14th battalion";
	static String nicknames ="Ganpats";
	int COC;
	String name;
	float Combat_Experience;
	
	void input ()
	{
//		System.out.println("Enter COC,Name and Number of tours of soldier ");
		Scanner sc=new Scanner(System.in);
		COC=sc.nextInt();
		name=sc.next();
		Combat_Experience=sc.nextFloat();
		
	}
	
	void Display()
	{
		System.out.print("1)Regiment: "+regiment+"\n2)Battalian: "+battalion+ "\n3)Nickmane: "+nicknames+ 
				"\n4)COC: "+COC+ "\n5)Name of soldier: "+name+"\n6)Combat Experience: "+Combat_Experience+"\n\n");
		
	}
}



public class Soldiers_Array {
        
	     public static void main(String[]args)
	     {
	    	 Scanner sc=new Scanner(System.in);
	    	 
	    	 Soldier s[]=new Soldier[3];
	    	 for(int i=0;i<=2;i++)
	    	 {
	    		 s[i]=new Soldier();
	    		 s[i].input();
	    	 }
	    	 
	    	 // Call Display 
	    	 for (int i=0;i<=2;i++)
	    	 {
	    		 s[i].Display();
	    	 }
	    	 
	    // sorting by experience 
	    	 
	    	 System.out.println("__________Sorting by Experience__________");
	    	 Soldier temp= new Soldier();
	    	 for (int i=0;i<3;i++)
	    	 {
	    		 for (int j=0;j<2;j++)
	    		 {
	    			 if(s[j].Combat_Experience <s[j+1].Combat_Experience)
	    			 {
	    				 temp=s[j];
	    				 s[j]=s[j+1];
	    				 s[j+1]=temp;
	    			 }
	    			 
	    		 }
	    	 }
	    	 for (int i=0;i<3;i++)
	    	 {
	    		 s[i].Display();
	    	 }
	    	 
	     }
	     
	     static
	     {
	    	 System.out.println("Enter COC,Name and Combat Experiance of soldier ");
	     }
	     
	     
	     }
