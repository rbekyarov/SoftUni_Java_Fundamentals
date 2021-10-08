package FU15_Exercise_Methods;

import java.util.Scanner;

public class p6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        checkWordCountSymbolOdd(word);
        checkWordCountSymbolEven(word);

    }

    private static void checkWordCountSymbolOdd(String word) {
        if (word.length() % 2 == 1) {
            for (int i = word.length() / 2; i < word.length(); i++) {
                char a = word.charAt(i);
                System.out.print((char) a);
                break;
            }
        }
    }

    private static void checkWordCountSymbolEven(String word) {
        if (word.length() % 2 == 0) {
            for (int i = word.length() / 2 - 1; i < word.length() / 2; i++) {
                char a = word.charAt(i);
                System.out.print((char) a);
                break;

            }
            for (int i = word.length() / 2; i < word.length(); i++) {
                char a = word.charAt(i);
                System.out.print((char) a);
                break;

            }
        }
    }
}