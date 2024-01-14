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
	public boolean isValidEmail(String email) {
        // Regular expression for validating the email address
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)@[a-zA-Z]+(\\.[a-zA-Z]{2,})(\\.[a-zA-Z]{2,})$";

        // Use String.matches() to check if the input matches the regular expression
        return email.matches(regex);
    }
	  public boolean isValidMobileNumber(String mobileNumber) {
	        // Regular expression for validating the mobile number
	        String regex = "^91\\s[1-9]\\d{9}$";

	        // Use String.matches() to check if the input matches the regular expression
	        return mobileNumber.matches(regex);
	    }
}
