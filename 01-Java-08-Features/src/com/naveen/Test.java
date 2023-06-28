package com.naveen;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String pwd;
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}	
}

class Test{
	
	public static void main(String[] args) {
		
		Predicate<User> p = u -> u.username.equals("Navin") && u.pwd.equals("Jadi");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String username = sc.next();
		
		System.out.println("Enter pwd: ");
		String pwd = sc.next();
		
		User user =  new User(username, pwd);
		if(p.test(user))
		{
			System.out.println("valid user");
			
		}
		else
		{
			System.out.println("Invalid user");
		}
		
	}
}