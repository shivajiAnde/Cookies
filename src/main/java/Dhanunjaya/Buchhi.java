package Dhanunjaya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/dhoni")
public class Buchhi extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String user=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		PrintWriter writter=res.getWriter();
		writter.print(user);
		writter.print(age);
		System.out.println(user);
		System.out.println(age);
		
	}

}
