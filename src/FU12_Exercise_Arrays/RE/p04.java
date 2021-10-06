package FU12_Exercise_Arrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countRotate = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countRotate; i++) {
            int firstNum = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstNum;
        }
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }
}
