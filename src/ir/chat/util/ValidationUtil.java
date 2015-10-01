package ir.chat.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mohammad Amin on 23/09/2015.
 */
public class ValidationUtil {
    private static final Pattern emailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$");

    public static boolean validateEmail(String email) {
        Matcher matcher = emailPattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static boolean validatePasswordStrengh(String password) {
        Matcher matcher = passwordPattern.matcher(password);
        if (!matcher.matches()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateConfirmPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
