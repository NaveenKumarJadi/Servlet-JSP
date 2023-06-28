
//Servlet First project for practice extending HttpServlet and using request and respond interfaces, tomcat server 9.0v and using get.Writer()

package com.naveen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//by extending the HttpServlet to make our normal class become Servlet
public class AddServlet extends HttpServlet 		
{
	
//	Service is a method which belong servlet life cycle 
//	using HttpServletRequest we can fetch data from client and using HttpServletResponse object to send response to the client

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

//		It always print the result on console, if you want to show an web page go to res.getWritter().println();
//		System.out.println("result is " + k);			

		PrintWriter out = res.getWriter();
		out.println("result is " + k);
	}
}
