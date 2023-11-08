package Dhanunjaya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/msd")
public class Shivaji extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 String user=req.getParameter("name");
	 int age=Integer.parseInt(req.getParameter("age"));
	 PrintWriter writter=res.getWriter();
	 writter.println(user);
	 writter.println(age);
	 System.out.println(user);
	 System.out.println(age);
	}

}
