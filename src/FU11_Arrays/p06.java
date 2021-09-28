/*
6.	Equal Arrays
        Read two arrays and print on the console whether they are identical or not.
        Arrays are identical if their elements are equal.
        If the arrays are identical find the sum of the first one and print on the console following message:
        "Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays
        differ and print on the console following message: "Arrays are not identical. Found difference at {index} index."
*/


        package FU11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean isEquals = true;
        int indexOfDifferent = 0;
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                indexOfDifferent = i;
                isEquals = false;
                break;
            }
            sum += array1[i];
        }
        if (isEquals) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexOfDifferent);
        }
    }
}
