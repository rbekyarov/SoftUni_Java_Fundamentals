package FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p7Theatre_Promotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (age < 0 || age > 123) {
            System.out.println("Error!");
            return;
        }
        switch (typeOfDay) {
            case "Weekday":
                if (age <= 18) {
                    price = 12;
                } else if (age <= 64) {
                    price = 18;
                } else if (age <= 122) {
                    price = 20;
                }
                break;
            case "Weekend":
                if (age <= 18) {
                    price = 15;
                } else if (age <= 64) {
                    price = 20;
                } else if (age <= 122) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age <= 18) {
                    price = 5;
                } else if (age <= 64) {
                    price = 12;
                } else if (age <= 122) {
                    price = 10;
                }
                break;
        }
        System.out.printf("%.0f$", price);
    }
}
