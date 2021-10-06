package FU14_Methods;

import java.util.Scanner;

public class p1Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        signInteger(integer);
    }

    private static void signInteger(int integer) {
        if (integer < 0) {
            System.out.printf("The number %s is negative.", integer);
        } else if (integer > 0) {
            System.out.printf("The number %s is positive.", integer);
        } else {
            System.out.printf("The number %s is zero.", integer);
        }
    }
}
