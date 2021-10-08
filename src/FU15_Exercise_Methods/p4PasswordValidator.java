/*
4.	Password Validator
        Write a program that checks if a given password is valid. Password rules are:
        •	6 – 10 characters (inclusive);
        •	Consists only of letters and digits;
        •	Have at least 2 digits.
        If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule print a message:
        •	"Password must be between 6 and 10 characters";
        •	"Password must consist only of letters and digits";
        •	"Password must have at least 2 digits".
*/
package FU15_Exercise_Methods;

import java.util.Scanner;

public class p4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        checker(password);
    }

    private static void checker(String password) {
        int wrongPasswordCount = 0;
        if (!checkNum(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            wrongPasswordCount++;
        }
        if (!checkLettDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            wrongPasswordCount++;
        }
        if (!check2digits(password)) {
            System.out.println("Password must have at least 2 digits");
            wrongPasswordCount++;
        }
        if (wrongPasswordCount < 1) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkNum(String password) {
        return password.length() >= 6 && password.length() <= 10;

    }

    private static boolean checkLettDigits(String password) {
        boolean checkLettDigits = true;
        for (int i = 0; i < password.length(); i++) {
            char check = password.charAt(i);
            if (!(Character.isDigit(check) || Character.isLetter(check))) {
                checkLettDigits = false;
                break;
            }
        }
        return checkLettDigits;
    }

    private static boolean check2digits(String password) {
        boolean check2digits = false;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char check = password.charAt(i);
            if (Character.isDigit(check)) {
                count++;
            }
            if ((count >= 2)) {
                check2digits = true;
                break;
            }

        }
        return check2digits;
    }
}