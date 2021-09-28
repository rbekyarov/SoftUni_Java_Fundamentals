/*
5.	Even and Odd Subtraction
        Write a program that calculates the difference between the sum of the even and
        the sum of the odd numbers in an array.
*/

        package FU11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }else {
                sumOdd +=numbers[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}