package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p3Passed_or_Failed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        if (grade<3){
            System.out.println("Failed!");
        } else{
            System.out.println("Passed!");
        }
    }
}
