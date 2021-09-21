package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p5Month_Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] mounts = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        for (int i = 1; i <= mounts.length ; i++) {
            if (input >=1 && input <= 12) {
                i = input-1;

                System.out.println(mounts[i]);
                break;
            } else {
                System.out.println("Error!");
                break;
            }
        }
    }
}
