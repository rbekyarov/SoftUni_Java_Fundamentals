package FU15_Exercise_Methods;

import java.util.Scanner;

public class p2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        getChar(word);
    }

    public static void getChar(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
