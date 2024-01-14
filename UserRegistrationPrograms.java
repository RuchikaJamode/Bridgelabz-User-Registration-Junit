package com.bridgelabz.junit.userregistration;

public class UserRegistrationPrograms {
	public boolean isValidFirstName(String firstName) {
        // Regular expression for validating the first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        // Use String.matches() to check if the input matches the regular expression
        return firstName.matches(regex);
    }
	public boolean isValidLastName(String lastName) {
        // Regular expression for validating the first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        // Use String.matches() to check if the input matches the regular expression
        return lastName.matches(regex);
    }
}
