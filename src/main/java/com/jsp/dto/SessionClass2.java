package com.jsp.dto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sess2")
public class SessionClass2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String id=(String)session.getAttribute("id");
		String name=(String)session.getAttribute("name");
		String email=(String)session.getAttribute("email");
		
		Student student=new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setEmail(email);
		
		session.setAttribute("student", student);
		session.removeAttribute("id");
		session.removeAttribute("name");
		session.removeAttribute("email");
		resp.sendRedirect("sess3");
	}
}
