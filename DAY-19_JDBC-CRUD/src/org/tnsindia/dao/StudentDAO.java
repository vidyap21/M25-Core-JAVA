package org.tnsindia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {

	public Connection createConnection()
	{
		String url="jdbc:mysql://127.0.0.1:3306/m25";
		String user="root";
		String password="mysql";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception Occurred"+e);
		}
		Connection c;
		try {
			c=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			c=null;
			System.out.println("Invalid Credentials");
		}
		return c;
		
	}
}
