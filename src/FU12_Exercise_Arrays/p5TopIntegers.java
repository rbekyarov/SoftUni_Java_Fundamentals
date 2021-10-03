package FU12_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int index = 0; index < array.length; index++) {
            boolean isBigerr = true;
            for (int i = index + 1; i < array.length; i++) {
                if (!(array[index] > array[i])) {
                    isBigerr = false;
                    break;
                }
            }
            if (isBigerr) {
                System.out.printf("%d ", array[index]);
            }
        }
    }
}
