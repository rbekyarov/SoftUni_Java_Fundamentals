package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p4Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChar = Integer.parseInt(scanner.nextLine());
        int sumChar = 0;
        for (int i = 0; i <numChar ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sumChar +=(int) symbol;

        }
        System.out.printf("The sum equals: %d",sumChar);
    }
}
