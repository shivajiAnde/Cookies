package com.cookietrail;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook1")
public class CookieClass1 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	Cookie cookie=new Cookie("id",id);
	Cookie cookie1=new Cookie("name",name);
	Cookie cookie2=new Cookie("email",email);
	resp.addCookie(cookie);
	resp.addCookie(cookie1);
	resp.addCookie(cookie2);
	resp.sendRedirect("cook2");
}
}




