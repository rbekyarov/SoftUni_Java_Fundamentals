package FU15_Exercise_Methods;

import java.util.Scanner;

public class p10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNumber; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isTopNumber(int number) {// числото е ТОП когато се дели на 8 и едно от числата му е нечетно
        return isSumDivideBy8(number) && isOneOddDigit(number);
    }

    private static boolean isSumDivideBy8(int number) {//проверяваме сумата на числата му дали се дели на 8
        int sumOfDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        return sumOfDigits % 8 == 0;
    }

    private static boolean isOneOddDigit(int number) {//търсим поне едно от числата му да е нечетно
        boolean OddDigit = false;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                OddDigit = true;
                break;
            }
            number /= 10;
        }
        return OddDigit;
    }
}
