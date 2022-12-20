package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {
    public static void main (String[] args){
        System.out.println("User Registration Problem");
        Scanner scanner=new Scanner(System.in);
        UserRegistrationInput userRegistration=new UserRegistrationInput();

        System.out.println("Enter first name:->");
        String firstName=scanner.next();
        if (userRegistration.isFirstNameValid(firstName))
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");

        System.out.println("Enter last name:->");
        String lastName=scanner.next();
        if (userRegistration.isLastNameValid(lastName))
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

        System.out.println("Enter email ");
        String email = scanner.next();
        if (userRegistration.isEmailValid(email))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

        System.out.println("Enter mobilenumber ");
        String mobilenumber = scanner.next();
        if (userRegistration.isMobileNumberValid(mobilenumber))
            System.out.println("Valid mobile number");
        else
            System.out.println("Invalid mobile number");


    }
}
