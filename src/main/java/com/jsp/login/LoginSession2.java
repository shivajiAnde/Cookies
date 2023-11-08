package com.jsp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/shivaji1")
public class LoginSession2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session=req.getSession();
	String user= (String)session.getAttribute("username");
	String pwd=(String)session.getAttribute("password");
	
	if(user.equals("aggipetta")&& pwd.equals("9966")) resp.sendRedirect("shivaji2");
	else resp.sendRedirect("shivaji3");
	
   }
}
