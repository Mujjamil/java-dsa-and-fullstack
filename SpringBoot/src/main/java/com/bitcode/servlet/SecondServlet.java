package com.bitcode.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			
			
		int num1=Integer.parseInt(request.getParameter("txtName1"));
		int num2=Integer.parseInt(request.getParameter("txtName2"));
		int sum=num1+num2;
		out.print("Addition="+sum);
			
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			String myName = request.getParameter("txtName");
			out.println("Hello Post Method !!"+myName);
		}

}
