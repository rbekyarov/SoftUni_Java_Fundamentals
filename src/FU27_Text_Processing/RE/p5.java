package FU27_Text_Processing.RE;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)){
                digit.append(current);
            } else if (Character.isLetter(current)){
                letter.append(current);
            }else {
                other.append(current);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}
