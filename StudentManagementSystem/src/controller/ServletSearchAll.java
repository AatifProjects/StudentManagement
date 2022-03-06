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

public class ServletSearchAll extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDAO stdDAO =  new StudentDAO();	
		List<StudentBean> stdBeanList = stdDAO.searchAll();
		
		
		req.setAttribute("stdBeanList", stdBeanList);
		RequestDispatcher rd = req.getRequestDispatcher("studentList.jsp");
		rd.forward(req, resp);
		
	}
	
	
	
}
