package FU27_Text_Processing;

import java.util.Scanner;

public class p3Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();//думичката която трябва да премахнем
        String text = scanner.nextLine();//текста от който трябва да проверим

        while (text.contains(word)) {

            text = removeWord(text, word);

        }
        System.out.println(text);
    }

    private static String removeWord(String text, String wordToRemove) {
        int begin = text.indexOf(wordToRemove);
        int end = begin + wordToRemove.length();
        String firstPart = text.substring(0, begin);
        String secondPart = text.substring(end);
        return firstPart + secondPart;
    }
}
