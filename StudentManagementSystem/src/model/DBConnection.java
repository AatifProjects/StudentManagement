package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnectionToDB() {
		Connection connection = null;
		
		try {
			// load the driver class
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			Class.forName("org.postgresql.Driver");			
			
			
			int i = 4;
			System.out.println(i);
			
			
			
			
			connection = DriverManager.getConnection("jdbc:postgresql://ec2-99-81-177-233.eu-west-1.compute.amazonaws.com\r\n"
					+ ":5432/d6iksgj88sskiu", "dbuczpcffiwzkf", "25ea96c3abca7691c415c4e19c16fd5f4a9f5bcef548fa8050afaf061cd3808f");

			
			
			
			// open a connection
			//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
			
			
		} 
		
		catch (ClassNotFoundException e) {
			System.out.println("failed to load the driver class");
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			System.out.println("failed to open a db connection");
			e.printStackTrace();
		}
		
		// check if connection is made 
//		if (connection != null) {
//			System.out.println("connected to db");
//		}
		
		
		return connection;
		
	}
	
}
