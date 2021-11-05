package FU25_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p1CountChars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> table = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == ' ') {
                continue;
            }
            if (!table.containsKey(currentSymbol)) {
                table.put(currentSymbol, 1);

            } else {
                int currentCount = table.get(currentSymbol);
                currentCount++;
                table.put(currentSymbol, currentCount);
            }
        }
        for (Map.Entry<Character, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
        }
        //печат със stream
        //table.entrySet().forEach(entry ->(entry.getKey()+ " -> " + entry.getValue()));
    }
}
