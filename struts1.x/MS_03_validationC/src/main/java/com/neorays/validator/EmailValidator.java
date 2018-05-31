package com.neorays.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component("emailValidator")
public class EmailValidator {

	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public EmailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
		System.out.println("=========================>"+this.getClass().getCanonicalName());
	}

	public boolean valid(final String email) {

		System.out.println("inside valid method");
		matcher = pattern.matcher(email);
		return matcher.matches();

	}
}