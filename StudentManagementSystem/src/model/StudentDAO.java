package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	
	// SEARCH ALL STUDENTS
	public List<StudentBean> searchAll() {
		
		List<StudentBean> stdBeanList = new ArrayList<StudentBean>();
		StudentBean stdBean = null;		
	
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM student_master");
		
		String sql = sb.toString();
		
		
		try {
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				stdBean = new StudentBean();
				stdBean.setRollNum(rset.getString("roll_num"));
				stdBean.setName(rset.getString("name"));
				stdBean.setGrade(rset.getString("grade"));
				stdBean.setSection(rset.getString("section"));				
				stdBean.setGender(rset.getString("gender"));
				stdBeanList.add(stdBean);
			}
			
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return stdBeanList;		
		
	}
	
	
		
	
	
	// SEARCH STUDENT
	public List<StudentBean> searchStudent(String rollNum, String name, String grade, String section, String gender) {
			
		List<StudentBean> stdBeanList = new ArrayList<StudentBean>();
		StudentBean stdBean = null;		
	
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM student_master");
		sb.append(" WHERE roll_num = '" + rollNum + "'");
		sb.append(" OR name = '" + name + "'");
		sb.append(" OR grade = '" + grade + "'");
		sb.append(" OR section = '" + section + "'");
		sb.append(" OR gender = '" + gender + "'");
		sb.append(" ORDER BY roll_num ;" );
		
		String sql = sb.toString();
		
		
		try {
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				stdBean = new StudentBean();
				stdBean.setRollNum(rset.getString("roll_num"));
				stdBean.setName(rset.getString("name"));
				stdBean.setGrade(rset.getString("grade"));
				stdBean.setSection(rset.getString("section"));				
				stdBean.setGender(rset.getString("gender"));
				stdBeanList.add(stdBean);
			}
			
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return stdBeanList;			
	}
	
	
	// OPEN PARTICULAR STUDENT PROFILE
	public StudentBean searchStudentProfile(String rollNum) {
		
		StudentBean stdBean = null;
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM student_master");
		sb.append(" WHERE roll_num = '" + rollNum + "'");		
			
		String sql = sb.toString();
		
		try {
			stmt = con.createStatement();
						
			ResultSet rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				stdBean = new StudentBean();
				stdBean.setRollNum(rset.getString("roll_num"));
				stdBean.setName(rset.getString("name"));
				stdBean.setGrade(rset.getString("grade"));
				stdBean.setSection(rset.getString("section"));
				stdBean.setGender(rset.getString("gender"));
			}
			
		con.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return stdBean;
	}	

	
	// EDIT STUDENT
	public boolean editStudent(String editStudID, String rollNum, String name, String grade, String section, String gender) {
		boolean editSuccess = false;
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE student_master");
		sb.append(" SET roll_num = '" +rollNum+ "'");	
		sb.append(" , name = '" +name+ "'");	
		sb.append(" , grade = '" +grade+ "'");	
		sb.append(" , section = '" +section+ "'");	
		sb.append(" , gender = '" +gender+ "'");	
		sb.append(" WHERE roll_num = '" +editStudID+ "'");
		
		String sql = sb.toString();	
		
		try {
			
			stmt = con.createStatement();
			stmt.execute(sql);	
			con.close();
			editSuccess = true;
			
		} catch (SQLException e) {
			editSuccess = false;
			e.printStackTrace();
		}
		
		return editSuccess;
		
	}


	// DELETE STUDENT
	public boolean delete(String deleteStudID) {
		boolean deleteSuccess = false;
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append(" DELETE FROM student_master");
		sb.append(" WHERE roll_num = '" +deleteStudID+ "'");
		
		String sql = sb.toString();	
		
		try {
			stmt = con.createStatement();			
			stmt.execute(sql);
			con.close();
			deleteSuccess = true;
			
		} catch (SQLException e) {
			deleteSuccess = false;
			e.printStackTrace();
		}
		
		return deleteSuccess;
		
	}
	
	

	// ADD NEW STUDENT
	public boolean addStudent(String rollNum, String name, String grade, String section, String gender) {		
					
		boolean addSuccess = false;
		Connection con = DBConnection.getConnectionToDB();
		Statement stmt = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append(" INSERT INTO student_master (roll_num, name, grade, section, gender) " );
		sb.append(" VALUES ('" +rollNum+ "', '" +name+ "', '" +grade+ "', '" +section+ "', '" +gender+ "' ) " );
		
		try {
			String sql = sb.toString();	
			
			stmt = con.createStatement();
			stmt.execute(sql);
			con.close();
			addSuccess = true;
			
		} catch (SQLException e) {
			addSuccess = false;
			e.printStackTrace();
		}
		
		return addSuccess;
		
		
	}


	

}
