package FU28_Exercise_Text_Processing.RE;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char result;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            result = (char) (current + 3);
            sb.append(result);
        }
        System.out.println(sb);
    }
}
