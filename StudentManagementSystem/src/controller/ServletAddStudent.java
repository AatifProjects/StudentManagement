package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

public class ServletAddStudent extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rollNum = req.getParameter("rollNum");
		String name = req.getParameter("name");
		String grade = req.getParameter("grade");
		String section = req.getParameter("section");
		String gender = req.getParameter("gender");
		
		StudentDAO stdDAO =  new StudentDAO();	
		
		boolean addSuccess = stdDAO.addStudent(rollNum, name, grade, section, gender);
		
		req.setAttribute("addSuccess", addSuccess);
		RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
		rd.forward(req, resp);
	
		//resp.sendRedirect("search.jsp");
		
		
		
	}
	
}
