package FU14_Methods;

import java.util.Scanner;

public class p5Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1.0;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }
        calculatePriceProduct(quantity, price);

    }

    private static void calculatePriceProduct(int quantity, double price) {
        System.out.printf("%.2f", quantity * price);
    }
}
