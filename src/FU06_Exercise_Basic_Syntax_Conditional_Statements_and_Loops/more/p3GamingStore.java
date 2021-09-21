package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops.more;

import java.util.Scanner;

public class p3GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        double sum = 0;
        boolean IsOutOfMoney = false;
        boolean isNotFound = false;
        while (!command.equals("Game Time")) {
            switch (command) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    isNotFound = true;
                    break;
            }
            if (price > budget) {
                System.out.println("Too Expensive");
            } else if (!isNotFound && price<=budget) {
                sum += price;
                System.out.printf("Bought %s\n", command);
            }
            if (sum >= budget) {
                IsOutOfMoney = true;
                break;
            }
            isNotFound = false;
            command = scanner.nextLine();
        }
        if (IsOutOfMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, budget - sum);
        }
    }
}
