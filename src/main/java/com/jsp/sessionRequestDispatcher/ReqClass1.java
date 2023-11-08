package com.jsp.sessionRequestDispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/trailform")
public class ReqClass1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id =	req.getParameter("id");
	String name =req.getParameter("name");
	String email=req.getParameter("email");
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	HttpSession session=req.getSession();
	
	session.setAttribute("id",id);
	session.setAttribute("name",name);
	session.setAttribute("email",email);
	RequestDispatcher rD=req.getRequestDispatcher("trailform2");
	rD.forward(req, resp);
	}
}