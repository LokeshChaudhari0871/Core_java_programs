package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root","");
			PreparedStatement st=con.prepareStatement("select * from student");
			ResultSet rs=st.executeQuery();
			
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
