package com.bitcode.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
//		case 1
		//String user = (String) request.getAttribute("user");
//		Cookie[] cookie= request.getCookies();
//		out.write("Welcome client!!"+cookie[0]);
		
		//case 2 session management read data from session 
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession(false);
		String uName = (String)session.getAttribute("sessionUser");
		if(uName != null) {
			out.write("Welcome session user+"+uName);
			out.print("<br><a href='Logout'>Logout</a>");
		
		}else {
			out.write("Session user not found!");
		}
		
				
	}

}
