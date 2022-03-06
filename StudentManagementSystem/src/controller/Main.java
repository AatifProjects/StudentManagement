package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.DBConnection;

public class Main {
	
	public static void main(String[] args) {
		
		Connection conn = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			String sql = " INSERT INTO student_table " +
			        " VALUES ('mickey', 'first', 'sD', 'female'); ";
			int c=stmt.executeUpdate(sql);
			if(c > 0)
				System.out.println(c+" Row Inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally{
			
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		
		
		
		
				
				
	}

}
