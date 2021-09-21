package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.next());
        double mousePrice = Double.parseDouble(scanner.next());
        double keyboardPrice = Double.parseDouble(scanner.next());
        double displayPrice = Double.parseDouble(scanner.next());
        int countMouse = 0;
        int countKeyboar = 0;
        int countHeadset = 0;
        int countDisplay = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                countHeadset++;
            }
            if (i % 3 == 0) {
                countMouse++;
            }
            if (i % 6 == 0) {
                countKeyboar++;
            }
            if (i % 12 == 0) {
                countDisplay++;
            }

        }
        double price = headsetPrice * countHeadset + mousePrice * countMouse + keyboardPrice * countKeyboar + displayPrice * countDisplay;
        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}
