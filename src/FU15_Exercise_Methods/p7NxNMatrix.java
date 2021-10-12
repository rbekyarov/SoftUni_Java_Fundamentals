package FU15_Exercise_Methods;

import java.util.Scanner;

public class p7NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());
        getMatrix(number);

    }
    private static void getMatrix(int number) {
        for (int i = 0; i <number ; i++) {
            System.out.println();
            for (int j = 0; j <number ; j++) {
                System.out.print(number+" ");
            }

        }
    }
}
