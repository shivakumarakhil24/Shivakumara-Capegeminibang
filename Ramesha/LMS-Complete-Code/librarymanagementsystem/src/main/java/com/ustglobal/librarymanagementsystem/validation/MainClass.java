//package com.ustglobal.librarymanagementsystem.validation;
//
//import java.io.Console;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class MainClass {
//	public static boolean validateEmail(String email) {
//		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\.\\w+");
//		Matcher mat = pattern.matcher(email);
//		if (mat.matches()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public static boolean validateName(String name) {
//		Pattern pat = Pattern.compile("\\w+\\D");
//		Matcher mat = pat.matcher(name);
//		if (mat.matches()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public static boolean validatePassword(String password) {
//		Pattern pat = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!*?&]).{6,20})");
//		Matcher mat = pat.matcher(password);
//		if (mat.matches()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public static void main(String[] args) {
//		String email ="rameshagowda@gmail.com";
//		String password = "Ramesha*123";
//		String name = "Ramesha";
//		System.out.println(validateEmail(email));
//		System.out.println(validateName(name));
//		System.out.println(validatePassword(password));
//		
//	}
//}
