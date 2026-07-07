package com.bitcode.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("txtUName");
		String password = request.getParameter("txtPassword");
		out.print(uName+" "+password);
		
		if(uName.equals("bitcode")&& password.equals("bitcode")) {
		
	//case 1//request object 
		
//	//request.setAttribute("user","bitcode");
		
			//Case 2 cookie case 
//		Cookie cookie = new Cookie(uName,password);
//		cookie.setMaxAge(24*60*60);
//		response.addCookie(cookie);
		
//				
			//rd.forward(requestt,response)
			
//			case 3 sessioin management 
		//Create Session
			
			HttpSession session = request.getSession();
			session.setAttribute("sessionUser",uName);
			
		
		
			RequestDispatcher rd = request.getRequestDispatcher("/Welcome");
		rd.forward(request,response);
		out.write("after forward");
		}else {
			response.sendRedirect("login.html");
		}
	}

}
