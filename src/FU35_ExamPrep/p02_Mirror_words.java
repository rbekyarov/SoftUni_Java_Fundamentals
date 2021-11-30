package FU35_ExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_Mirror_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])(?<word>[A-z]{3,})\\1{2}(?<mirror>[A-z]{3,})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        //Map<String, String> mirrorWord = new LinkedHashMap<>();
        List< String> mirrorWord = new ArrayList<>();

        int count = 0;
        while (matcher.find()) {
            count++;
            StringBuilder checkMirror = new StringBuilder();
            String word = matcher.group("word");
            String mirror = matcher.group("mirror");
            for (int i = word.length() - 1; i >= 0; i--) {
                char currentSymbol = word.charAt(i);
                checkMirror.append(currentSymbol);
            }
            if (mirror.equals(checkMirror.toString())) {
                mirrorWord.add(word+" <=> "+mirror);
            }
        }
        if (count != 0) {
            System.out.printf("%d word pairs found!%n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if ( count > 0 && mirrorWord.size()>0) {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWord));
        }else {
            System.out.println("No mirror words!");
        }
    }
}

