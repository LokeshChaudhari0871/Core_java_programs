package com.jdbc;
import java.sql.*;

public class Delete {
	public static void main(String[]args){
		
		try
		{
			Class.forName("com.mysql.jdbc",false,null);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
