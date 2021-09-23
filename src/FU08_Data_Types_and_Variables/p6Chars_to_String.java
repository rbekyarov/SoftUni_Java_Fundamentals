package FU08_Data_Types_and_Variables;

import java.util.Scanner;

public class p6Chars_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        System.out.println(Character.toString(a)+
                Character.toString(b)+
                Character.toString(c));

    }
}
