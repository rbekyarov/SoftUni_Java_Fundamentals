package FU27_Text_Processing.RE;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String replacementWord = "";
            if (text.contains(bannedWord)) {

                replacementWord = repeatAsterisks(bannedWord.length());
                text = text.replace(bannedWord, replacementWord);
            }
        }
        System.out.println(text);
    }

    private static String repeatAsterisks(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
