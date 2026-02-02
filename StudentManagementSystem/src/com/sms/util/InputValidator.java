package com.sms.util;

public class InputValidator {

    // Name validation (only letters & spaces, min 3 chars)
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z ]{3,}");
    }

    // Email validation
    public static boolean isValidEmail(String email) {
        return email != null &&
               email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // Department validation
    public static boolean isValidDepartment(String dept) {
        return dept != null && dept.length() >= 2;
    }

    // ID validation
    public static boolean isValidId(int id) {
        return id > 0;
    }
}
