package FU28_Exercise_Text_Processing;

import java.util.Scanner;

public class p4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i <input.length() ; i++) {
           char symbol = input.charAt(i);
           int result = (char)symbol+3;
           char r = (char) result;
            System.out.print(r);
        }

        //StringBuilder sb = new StringBuilder();
        //
        //        sb.append(scan.nextLine());
        //        for (int i = 0; i < sb.length(); i++) {
        //        char symbol = sb.charAt(i);
        //            char newSymbol = (char) (symbol+3);
        //            System.out.print(newSymbol);

    }
}
