package com.jsp.dto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sess3")
public class SessionClass3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		Object object=session.getAttribute("student");

//		String id=(String)session.getAttribute("id");
//		String name=(String)session.getAttribute("name");
//		String email=(String)session.getAttribute("email");
//		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<body bgcolor=green>");
		writer.println("<h1 style=\"color:red;\">"+object+"</h1>");
		writer.println("</body>");
	
		
	}
}
