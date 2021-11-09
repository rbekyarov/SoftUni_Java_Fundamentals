package FU27_Text_Processing;

import java.util.Scanner;

public class p1ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        while (!str.equals("end")){
            System.out.printf("%s = %s\n",str,reverseString(str));
            str = scanner.nextLine();
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}