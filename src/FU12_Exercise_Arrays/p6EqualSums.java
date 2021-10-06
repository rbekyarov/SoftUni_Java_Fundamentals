package FU12_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // четене числа от конзолата на един ред и създаване на масив от тип INT
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            int currentElement = array[index];
            int leftSum = 0;
            int rightSum = 0;
            //лява сума
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += array[leftIndex];
            }
            //дясна сума
            for (int rightIndex = index + 1; rightIndex <= array.length - 1; rightIndex++) {
                rightSum += array[rightIndex];
            }
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
            }

        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
