package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationInput {
    private Pattern pattern;
    private Matcher matcher;

    /**
     *pattern for first name
     */
    public boolean isFirstNameValid(String firstName){
        String regex="[A-Z][a-z]{2,}";
        pattern= Pattern.compile(regex);
        matcher=pattern.matcher(firstName);
        return matcher.matches();
    }

    /**
     * pattern for last name
     */
    public boolean isLastNameValid(String lastName){
        String regex="[A-Z][a-z]{2,}";
        pattern= Pattern.compile(regex);
        matcher=pattern.matcher(lastName);
        return matcher.matches();
    }
}
