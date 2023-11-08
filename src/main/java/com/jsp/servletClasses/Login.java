package com.jsp.servletClasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/shiv")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		
		if(user.equals("shivaji")&&password.equals("9966918807")) {
			req.setAttribute("password", password.toUpperCase());
			req.getRequestDispatcher("login2").forward(req, resp);
		}
		else {
			String invalid="Invalid";
			req.setAttribute("invalid",invalid.toUpperCase());
			req.getRequestDispatcher("login3").forward(req, resp);
		}
	}
}
