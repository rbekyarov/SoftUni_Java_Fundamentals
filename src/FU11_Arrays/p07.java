package FU11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while (array.length > 1) {
            int[] condensed = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                condensed[i] = array[i] + array[i + 1];

            }
            array = condensed;
        }
        System.out.println(array[0]);
    }
}

