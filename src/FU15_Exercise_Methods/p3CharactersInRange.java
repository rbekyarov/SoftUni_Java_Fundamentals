package FU15_Exercise_Methods;

import java.util.Scanner;

public class p3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        getCharInRange(start, end);
    }

    private static void getCharInRange(char start, char end) {
        if ( start <end ){
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        } else{
            for (int i = end+1; i < start ; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
