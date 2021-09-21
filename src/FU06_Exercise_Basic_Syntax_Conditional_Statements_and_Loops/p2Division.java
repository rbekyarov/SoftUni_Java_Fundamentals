package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p2Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*    int num = Integer.parseInt(scanner.nextLine());
        String print = "";
        if (num % 2 == 0) {
             print = "The number is divisible by 2";
        }
        if (num % 3 == 0) {
             print = "The number is divisible by 3";
        }
        if (num % 6 == 0) {
             print = "The number is divisible by 6";
        }
        if (num % 7 == 0) {
             print = "The number is divisible by 7";
        }
        if (num % 10 == 0) {
             print = "The number is divisible by 10";
        }
        if (num % 2 != 0 && num % 3 != 0 && num % 6 != 0 && num % 7 != 0 && num % 10 != 0 ){
            print = "Not divisible";
        }
        System.out.println(print);*/
        int number = Integer.parseInt(scanner.nextLine());
        int devider = 0;
        if (number % 10 == 0) {
            devider = 10;
        } else if (number % 7 == 0) {
            devider = 7;
        } else if (number % 6 == 0) {
            devider = 6;
        } else if (number % 3 == 0) {
            devider = 3;
        } else if (number % 2 == 0) {
            devider = 2;
        }
        if (devider == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", devider);
        }
    }
}
