package FU12_Exercise_Arrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int bestCount = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    if (count > bestCount) {
                        bestCount = count;
                        index = i;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < bestCount; i++) {
            System.out.print(numbers[i + index] + " ");
        }
    }
}