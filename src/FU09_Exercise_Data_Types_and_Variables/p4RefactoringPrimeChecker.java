package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p4RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isTrue);

        }

    }
}
