package FU28_Exercise_Text_Processing.More;

import java.util.Scanner;

public class p2AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (symbol1 < symbol2) {
                if (currentChar > symbol1 && currentChar < symbol2) {
                    sum += currentChar;
                }
            } else {
                if (currentChar < symbol1 && currentChar > symbol2) {
                    sum += currentChar;
                }
            }
        }
        System.out.println(sum);
    }
}
