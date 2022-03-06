package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.StudentDAO;

public class ServletEditStudent extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session  = req.getSession();
		String editStudID = (String) session.getAttribute("editStudID");
		
		
		String rollNum = req.getParameter("rollNum");
		String name = req.getParameter("name");
		String grade = req.getParameter("grade");
		String section = req.getParameter("section");
		String gender = req.getParameter("gender");
		
		StudentDAO stdDAO =  new StudentDAO();
		boolean editSuccess = stdDAO.editStudent(editStudID,rollNum, name, grade, section, gender);
		
		req.setAttribute("editSuccess", editSuccess);
		RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
		rd.forward(req, resp);
			
	    
		
	}
	

}
