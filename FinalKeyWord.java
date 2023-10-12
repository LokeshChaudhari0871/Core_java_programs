package com.inheritance;
class officer
{
	void rank()
	{
		System.out.println("Major general");
	}
}
class officer1 extends officer
{
	void rank()
	{
		System.out.println("Lieutenant General");
	}
}

class officer2 extends officer1
{
	void rank()
	{
		System.out.println("General");
	}
}

final class chief extends officer2 //  there will be no more inheritance after this class
{
	void rank()
	{
		System.out.println("Field Marshal");
	}
}

//class Commander extends chief  //   We cannot create child from final class 
//{
//	void khd()
//	{
//		
//	}
//	
//}


public class FinalKeyWord {
		public static void main(System args[])
		{
			chief c1=new chief();
			c1.rank();
			
		}
}
