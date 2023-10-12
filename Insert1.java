package com.jdbc;


import java.sql.Connection;
import java.sql.*;
import java.util.*;


public class Insert1
{
	
	public static void main(String args [])
	{
		
			try
			{
				char ans;
				int rollno;
				String name;
				float per;
				String batch;
				Scanner sc=new Scanner(System.in);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "");
				do
				{
					System.out.println("Enter rollno, name, per and branch");
					rollno=sc.nextInt();
					name=sc.next();
					per=sc.nextFloat();
					batch=sc.next();
					PreparedStatement st=con.prepareStatement("insert into details values(?,?,?,?)");
					st.setInt(1, rollno);
					st.setString(2, name);
					st.setFloat(3, per);
					st.setNString(4, batch);
					
					int n=st.executeUpdate();
					System.out.println(n+"Record Inserted");
					ans=sc.next().charAt(0);
				}
				while(ans=='y');
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
