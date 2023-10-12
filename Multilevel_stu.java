package com.inheritance;
class Results extends Physical
{
	void Display3()
	{
		if(Combat_Experience >= 3.5 && Total >= 80)
		{
			System.out.println("You are selected");
		}
		
		else
		{
			System.out.println("Better luck next time");
		}
	}
	
}


public class Multilevel_stu {

	public static void main(String[] args) {
		Results r=new Results();
		r.input();
		r.Display();
		r.input1();
		r.Display2();
		r.Display3();
		

	}

}
