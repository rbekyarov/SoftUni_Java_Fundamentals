package FU12_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p7MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestCount = 0;
        int index = 0;
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
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
            System.out.print(arr[i + index] + " ");
        }
    }
}
