package com.cookietrail;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook2")
public class Cookieclass2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] arr=req.getCookies();
		String id=null;
		String name=null;
		String email=null;
		for(Cookie c:arr) {
			if(c.getName().equals("id")) {
				id=c.getValue();
				c.setMaxAge(0);
//				System.out.println(c.getPath());
//				System.out.println(c.getDomain());
			}
			if(c.getName().equals("name")) {
				name=c.getValue();
				c.setMaxAge(0);
//				System.out.println(c.getPath());
//				System.out.println(c.getDomain());
			}
			if(c.getName().equals("email")) {
				email=c.getValue();
				c.setMaxAge(0);
//				System.out.println(c.getPath());
//				System.out.println(c.getDomain());
			}
		}
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
