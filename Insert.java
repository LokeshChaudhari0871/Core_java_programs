package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		try 
		{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				PreparedStatement st=con.prepareStatement("insert into student values(21,'kunal',98)");

				
			int n=st.executeUpdate();
			System.out.println(n+"record inserted");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
