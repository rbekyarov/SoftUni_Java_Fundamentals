
/*
7.	Vending Machine
        You task is to calculate the total price of a purchase from a vending machine.
        Until you receive "Start" you will be given different coins that are being inserted in the machine.
        You have to sum them in order to have the total money inserted. There is a problem though.
        Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
        If someone tries to insert some other coins you have to display "Cannot accept {money}",
        where the value is formated to the second digit after the decimal point and not add it to the total money.
        On the next few lines until you receive "End" you will be given products to purchase.
        Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke".
        The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
        If the person tries to purchase a not existing product print “Invalid product”.
        Be careful that the person may try to purchase a product for which he doesn't have money.
        In that case print "Sorry, not enough money". If the person purchases a product successfully print
        "Purchased {product name}". After the “End” command print the money that are
        left formatted to the second decimal point in the format "Change: {money left}".
*/


package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumCoins = 0;
        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sumCoins += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);

            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        double price = 0;
        double sumPrice = 0;
        while (!command.equals("End")) {
            if (command.equals("Nuts") || command.equals("Water") || command.equals("Crisps") || command.equals("Soda") || command.equals("Coke")) {
                switch (command) {
                    case "Nuts":
                        price = 2;
                        sumCoins -= price;
                        if (sumCoins < 0) {
                            sumCoins += price;
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                        System.out.printf("Purchased %s\n", command);
                        break;
                    case "Water":
                        price = 0.7;
                        sumCoins -= price;
                        if (sumCoins < 0) {
                            sumCoins += price;
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                        System.out.printf("Purchased %s\n", command);
                        break;
                    case "Crisps":
                        price = 1.5;
                        sumCoins -= price;
                        if (sumCoins < 0) {
                            sumCoins += price;
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                        System.out.printf("Purchased %s\n", command);
                        break;
                    case "Soda":
                        price = 0.8;
                        sumCoins -= price;
                        if (sumCoins < 0) {
                            sumCoins += price;
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                        System.out.printf("Purchased %s\n", command);
                        break;
                    case "Coke":
                        price = 1;
                        sumCoins -= price;
                        if (sumCoins < 0) {
                            sumCoins += price;
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                        System.out.printf("Purchased %s\n", command);
                        break;
                }
            } else {
                System.out.println("Invalid product");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
