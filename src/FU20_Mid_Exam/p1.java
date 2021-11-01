package FU20_Mid_Exam;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsCity = Integer.parseInt(scanner.nextLine());

        double profit = 0;
        for (int i = 1; i <= numsCity; i++) {
            String name = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            double expens = Double.parseDouble(scanner.nextLine());
            if (i == 3 || i == 6 || i == 9 || i == 12) {
                expens = expens + expens * 0.50;
            }
            if (i == 5 || i == 10 || i == 15) {
                money *= 0.90;
            }
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", name, money - expens);
            profit += money - expens;
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", profit);
    }
}