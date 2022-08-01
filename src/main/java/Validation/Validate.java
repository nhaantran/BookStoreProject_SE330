/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nhaantran
 */
public class Validate {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean EmailValidate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static final Pattern VALID_PASSWORD_REGEX
            = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", Pattern.CASE_INSENSITIVE);

    public static boolean PasswordValidate(char[] passwordchar) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(String.valueOf(passwordchar));
        return matcher.find();
    }
    
    public static final Pattern VALID_FULL_NAME_REGEX
            = Pattern.compile("^[a-zA-Z\\s]+", Pattern.CASE_INSENSITIVE);

    public static boolean FullNameValidate(String fullnameStr) {
        Matcher matcher = VALID_FULL_NAME_REGEX.matcher(fullnameStr);
        return matcher.find();
    }
    
    
}
