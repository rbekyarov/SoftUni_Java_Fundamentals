package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p10Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);

        }






    }
}
