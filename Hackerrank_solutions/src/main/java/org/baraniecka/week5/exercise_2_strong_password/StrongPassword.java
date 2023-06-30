package org.baraniecka.week5.exercise_2_strong_password;

import java.util.regex.Pattern;

public class StrongPassword {

    /*
    Louise joined a social networking site to stay in touch with her friends.
    The signup page required her to input a name and a password.
    However, the password must be strong. The website considers a password
    to be strong if it satisfies the following criteria:

    Its length is at least 6.
    It contains at least one digit.
    It contains at least one lowercase English character.
    It contains at least one uppercase English character.
    It contains at least one special character. The special characters are: !@#$%^&*()-+

    She typed a random string of length n
    in the password field but wasn't sure if it was strong.
    Given the string she typed, can you find the minimum number
    of characters she must add to make her password strong?
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String strongPasswordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()+-]).*";
        int result = 0;

        if (password.matches(strongPasswordPattern) && n < 6 || n == 0) {
            result = 6 - n;
            return result;
        }
        if (Pattern.matches("^[^a-z]*$", password)) {
            result++;
        }
        if (Pattern.matches("^[^A-Z]*$", password)) {
            result++;
        }
        if (Pattern.matches("^[^0-9]*$", password)) {
            result++;
        }
        if (Pattern.matches("^[^!@#$%^&*()+-]*$", password)) {
            result++;
        }
        if (n + result < 6) {
            result += 6 - (n + result);
        }

        return result;
    }
}
