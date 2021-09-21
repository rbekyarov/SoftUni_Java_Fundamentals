package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
