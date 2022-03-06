package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.StudentBean;
import model.StudentDAO;

public class ServletStudentList extends HttpServlet	{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session =  req.getSession();
//		String rollNum = (String) session.getAttribute("rollNum");
		
		String rollNum=req.getParameter("studRollNo");
				
		StudentDAO stdDAO = new StudentDAO();
		StudentBean stdBean = stdDAO.searchStudentProfile(rollNum);
		
		req.setAttribute("stdBean", stdBean);
		RequestDispatcher rd = req.getRequestDispatcher("studentProfile.jsp");
		rd.forward(req, resp);
		
		
		String rollNo=req.getParameter("studRollNo");
		
		
	}
	
	

}
