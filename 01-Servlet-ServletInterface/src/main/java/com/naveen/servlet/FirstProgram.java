package com.naveen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
	
	ServletConfig con;

//	This method will execute only once, so we are creates object only once for entire package 
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method call");

		con = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method call");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to Servlet");
		out.println("Today " + new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
	}

	@Override
	public void destroy() {
		System.out.println("destroy method call");
	}

//	This method is create the object
	@Override
	public ServletConfig getServletConfig() {
		return con;
	}

//	This method is create the loginfo
	@Override
	public String getServletInfo() {
		return "My First Servlet Program";
	}

}
