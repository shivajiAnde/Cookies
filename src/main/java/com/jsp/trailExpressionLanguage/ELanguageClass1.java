package com.jsp.trailExpressionLanguage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/e1class1")
public class ELanguageClass1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Customer customer=new Customer();
		customer.setId(req.getParameter("id"));
		customer.setName(req.getParameter("name"));
		customer.setEmail(req.getParameter("email"));
		customer.setAge(req.getParameter("age"));
		customer.setAddress(req.getParameter("address"));
		System.out.println(customer);
		Customer customer2=new Customer("1","arjun reddy","@royal","22","13/366");
		Customer customer3=new Customer("4","Ande shivaji royal","@royal","22","13/366");
		Customer customer4=new Customer("3","Ande mounika royal","@royal","22","13/366");
		Customer customer5=new Customer("6","seetha rama raju","@royal","22","13/366");
		List<Customer> list=new ArrayList<>();
		list.add(customer);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		
		HttpSession session=req.getSession();
		session.setAttribute("clist",list);
		resp.sendRedirect("Directive.jsp");
	}
}