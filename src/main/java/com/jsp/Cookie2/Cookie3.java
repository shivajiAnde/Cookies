package com.jsp.Cookie2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] arr=req.getCookies();
	String user=null;
	String password=null;
//	String email=null;
	for(Cookie c:arr) {
		if(c.getName().equals("user")) {
			user=c.getValue();
//			c.setMaxAge(0);
//			System.out.println(c.getPath());
//			System.out.println(c.getDomain());
		}
		if(c.getName().equals("password")) {
			password=c.getValue();
//			c.setMaxAge(0);
//			System.out.println(c.getPath());     
//			System.out.println(c.getDomain());
		}
//		if(c.getName().equals("email")) {
//			email=c.getValue();
//			c.setMaxAge(0);
////			System.out.println(c.getPath());
////			System.out.println(c.getDomain());
//		}
	}
	PrintWriter writer=resp.getWriter();
	writer.println(user);
	writer.println(password);
	System.out.println(user);
	System.out.println(password);
//	System.out.println(email);
}
}
