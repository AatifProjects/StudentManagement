package controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.StudentDAO;

public class ServletDeleteStudent extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session  = req.getSession();
		String deleteStudID = (String) session.getAttribute("deleteStudID");
		
		StudentDAO studDAO = new StudentDAO();
		boolean deleteSuccess = studDAO.delete(deleteStudID);
		
		req.setAttribute("deleteSuccess", deleteSuccess);
		RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
		rd.forward(req, resp);
		//resp.sendRedirect("search.jsp");
		
	}
	
	
}
