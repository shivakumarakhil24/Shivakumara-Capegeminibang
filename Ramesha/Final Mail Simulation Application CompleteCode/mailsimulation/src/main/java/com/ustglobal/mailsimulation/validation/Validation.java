package com.ustglobal.mailsimulation.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Validation {
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		Matcher mat = pattern.matcher(email);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateName(String name) {
		Pattern pat = Pattern.compile("\\w+");
		Matcher mat = pat.matcher(name);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatePassword(String password) {
		Pattern pat = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!*?&]).{6,20})");
		Matcher mat = pat.matcher(password);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
