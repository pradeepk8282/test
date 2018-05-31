package com.neorays.temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester2 
{
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[a-z]{5}");
		Matcher c=pattern.matcher("abcdea");
		boolean v=c.matches();
		System.out.println(v);
	}
}
