package FU27_Text_Processing.RE;

import java.util.Scanner;

public class p2_short {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String e : input) {
            result.append(e.repeat(e.length()));
        }
        System.out.println(result);
    }
}
