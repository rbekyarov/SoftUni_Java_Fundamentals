package FU28_Exercise_Text_Processing;

import java.util.Scanner;

public class p6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char base = input.charAt(0);
        sb.append(base);

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != base) {
                sb.append(current);
                base=current;
            }
        }
        System.out.println(sb.toString());
    }
}
