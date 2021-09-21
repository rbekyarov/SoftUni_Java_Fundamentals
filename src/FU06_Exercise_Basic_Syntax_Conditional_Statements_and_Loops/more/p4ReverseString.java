package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops.more;

import java.util.Scanner;

public class p4ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        for (int i = text.length()-1; i >=0 ; i--) {
            char letter = text.charAt(i);
            System.out.print(letter);

        }
    }
}
