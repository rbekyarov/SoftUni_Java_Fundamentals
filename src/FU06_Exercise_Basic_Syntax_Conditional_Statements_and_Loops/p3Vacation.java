package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.8;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.9;
                } else if (day.equals("Saturday")) {
                    price = 15.6;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.5;
                }
                break;
        }
        double totalPrice = price * people;

        if (type.equals("Students") && people >= 30) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }
        if (type.equals("Business ") && people >= 100) {
            totalPrice = price * (people - 10);
        }
        if (type.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
