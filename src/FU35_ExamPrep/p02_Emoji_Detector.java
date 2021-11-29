package FU35_ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_Emoji_Detector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int coolThreshold = 1;
        List<String> emojis = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)) {
                coolThreshold *= Integer.parseInt(current + "");
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        String regex = "([:*]{2})(?<sumting>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int countFindEmoji = 0;
        while (matcher.find()) {
            countFindEmoji++;
            String emoji = matcher.group();
            int sumSymbolEmoji = 0;
            for (int i = 0; i < emoji.length(); i++) {
                char current = emoji.charAt(i);
                sumSymbolEmoji += current;

            }
            if (sumSymbolEmoji >= coolThreshold) {
                emojis.add(emoji);
            }
        }
        System.out.printf("%d emojis found in the text. ", countFindEmoji);
        System.out.println("The cool ones are:");
        for (String emoji : emojis) {
            System.out.println(emoji+" ");
        }
    }
}