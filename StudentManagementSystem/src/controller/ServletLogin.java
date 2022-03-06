package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId = request.getParameter("loginId");		
		String loginPass = request.getParameter("loginPass");	
		
		if ((loginId.equals("admin")) && (loginPass.equals("root"))) {	
			
			HttpSession session = request.getSession();
			session.setAttribute("loginId", loginId);
			session.setAttribute("loginPass", loginPass);
			
			response.sendRedirect("search.jsp");
		}
		
		else {
//			PrintWriter out = response.getWriter();
//			out.println("invalid login attempt");
			response.sendRedirect("invalid.jsp");
			
		}
		
	}

}
