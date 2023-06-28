package com.naveen;

import java.util.function.Predicate;

class Test
{
	public static void main(String[] args) {
		
		String[] names = {"sunny", "kajal", "malika", "katrina", "kareena"};
		
		Predicate<String> startsWithK = s -> s.charAt(0)== 'k';
		System.out.println("The Names starts with K are:");
		for(String s: names)
		{
			if(startsWithK.test(s))
			{
				System.out.println(s);
			}
		}
	}
}
