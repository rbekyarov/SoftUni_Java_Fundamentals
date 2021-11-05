package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> wordMap = new LinkedHashMap<>();
        List<String> wordList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        for (String word : wordList) {

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (!wordMap.containsKey(currentChar)) {
                    wordMap.put(currentChar, 1);
                } else {
                    int currentValue = wordMap.get(currentChar);
                    wordMap.put(currentChar, currentValue + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
