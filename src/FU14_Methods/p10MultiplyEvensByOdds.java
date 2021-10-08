package FU14_Methods;

import java.util.Scanner;

public class p10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int result = getOddandEvenMultip(Math.abs(number));
        System.out.println(result);
    }

    private static int getOddandEvenMultip(int number) {
        int oddSum = getOddSum(number);
        int evenSum = getEvenSum(number);
        return oddSum * evenSum;
    }

    private static int getEvenSum (int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                evenSum += digit;
            }
            number = number/10;
        }
        return evenSum;
    }

    private static int getOddSum(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                oddSum += digit;
            }
            number = number/10;
        }
        return oddSum;

    }
}
