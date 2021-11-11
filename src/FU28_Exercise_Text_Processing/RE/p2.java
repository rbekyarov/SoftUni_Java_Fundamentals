package FU28_Exercise_Text_Processing.RE;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String word1 = input.get(0);
        String word2 = input.get(1);
        int n = Math.min(word1.length(), word2.length());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char symbol1 = word1.charAt(i);
            char symbol2 = word2.charAt(i);
            sum += symbol1 * symbol2;

        }

        if (word1.length() > word2.length()) {

            for (int i = word2.length(); i <= word1.length() - 1; i++) {
                char symbol1 = word1.charAt(i);
                sum += symbol1;
            }
        } else if (word2.length() > word1.length()) {
            for (int i = word1.length(); i <= word2.length() - 1; i++) {
                char symbol2 = word2.charAt(i);
                sum += symbol2;
            }
        }
        System.out.println(sum);
    }
}
