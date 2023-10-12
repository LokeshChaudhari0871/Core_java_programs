package com.strings;

import java.util.Scanner;

class check_pass
{
	void password(String s)throws Exception
	{
		if(s.length()<=8)
		{
			throw new Exception("Please enter password more than 8 caracters");
		}
		else
		{
			System.out.println("valid password");
		}
	}
}
public class Password {
	public static void main(String args[])
	{
		String password;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter password");
		password=sc.next();
		
		check_pass p =new check_pass();
		try
		{
			p.password(password);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}