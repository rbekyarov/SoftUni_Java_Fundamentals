package FU12_Exercise_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p4LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

    }
}
