package com.naveen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram extends GenericServlet{

//	service() method is mandatory in GenericServlet
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Generic Servlet");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Date = " + new Date().toString());
	}

}
