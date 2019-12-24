package com.jdbc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {
	static Pattern pattern;
	static Matcher matcher;
	public static void main(String[] args) {
		//to match numbers
		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher("1");
		System.out.println("pattern \\d:"+matcher.matches());
		//to match numbers
		pattern = Pattern.compile("\\d+");
		matcher = pattern.matcher("185854325676");
		System.out.println("pattern \\d+:"+matcher.matches());
		
		//tO MATCH CHARCTERS
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher("");
		System.out.println("pattern \\w:"+matcher.matches());
		
	}}
	


