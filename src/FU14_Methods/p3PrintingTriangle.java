package FU14_Methods;

import java.util.Scanner;

public class p3PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printTriangle(num);
    }

    private static void printTriangle(int num) {
        for (int i = 1; i <=num ; i++) {
            print(i);
        }
        for (int j = num-1; j >=1 ; j--) {
            print(j);

        }
    }

    private static void print(int n) {
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
