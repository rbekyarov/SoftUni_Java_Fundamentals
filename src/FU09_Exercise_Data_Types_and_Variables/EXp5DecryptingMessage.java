package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class EXp5DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {

            char symbol = scanner.nextLine().charAt(0);

          int  newSymbol =symbol+key;
            System.out.print((char)newSymbol);

        }
    }
}
