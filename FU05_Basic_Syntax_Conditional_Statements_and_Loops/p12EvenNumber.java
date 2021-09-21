package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        while (num % 2 == 1) {
            System.out.println("Please write an even number.");
            num = Math.abs(Integer.parseInt(scanner.nextLine()));
        }
        System.out.printf("The number is: %d", num);

    }
}
