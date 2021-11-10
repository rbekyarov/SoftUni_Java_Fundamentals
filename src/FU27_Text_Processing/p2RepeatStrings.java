package FU27_Text_Processing;

import java.util.Scanner;

public class p2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]words = scanner.nextLine().split(" ");

        for (String word: words){

            String repeateWord = repeateWord (word, word.length());
            System.out.print(repeateWord);
        }
    }

    private static String repeateWord(String word, int length) {
        String result = "";
        for (int i = 0; i <length ; i++) {
            result+=word;

        }
        return result;
    }
}
