package com.inheritance;

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
		System.out.println("Enter COC,Name and Combat Experience of soldier ");
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

class Physical extends Soldier
{
	int Running_Score;
	float Long_jump;
	float Total;
	Scanner sc = new Scanner(System.in);

	void input1 ()
	{	
		System.out.println("\nEnter Score: ");
		Running_Score=sc.nextInt();
		Long_jump=sc.nextFloat();
		
	}
	
	void Display2()
	{
		
		System.out.println("1)Running score: " +Running_Score+ "\n2)Long_jump"+Long_jump  );
		Total= Running_Score + Long_jump;
		System.out.println("\nTotal Score Physical: "+Total);
	}
	
	
}

public class Single_Soldier {

	public static void main(String[] args) {
		Physical s=new Physical ();
		s.input();
		s.Display();
		s.input1();
		s.Display2();
	}

}
