package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p5Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int charStart = Integer.parseInt(scanner.nextLine());
        int charStop = Integer.parseInt(scanner.nextLine());

        for (int i = charStart; i <=charStop ; i++) {
            char current = (char)i;
            System.out.printf("%c ",current);
        }
    }
}
