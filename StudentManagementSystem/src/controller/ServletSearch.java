package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentBean;
import model.StudentDAO;

public class ServletSearch extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rollNum = req.getParameter("rollNum");
		String name = req.getParameter("name");
		String grade = req.getParameter("grade");
		String section = req.getParameter("section");
		String gender = req.getParameter("gender");
		
		StudentDAO stdDAO =  new StudentDAO();	
		List<StudentBean> stdBeanList = stdDAO.searchStudent(rollNum, name, grade, section, gender);
		
		req.setAttribute("stdBeanList", stdBeanList);
		RequestDispatcher rd = req.getRequestDispatcher("studentList.jsp");
		rd.forward(req, resp);
		
		
				
		
		
		
	}
	
	

}
