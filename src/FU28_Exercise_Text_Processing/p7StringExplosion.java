package FU28_Exercise_Text_Processing;

import java.util.Scanner;

public class p7StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        int power = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                sb.append('>');
            } else if (power == 0) {
                sb.append(currentChar);
            } else {
                power--;
            }
        }
        System.out.println(sb);
    }
}
