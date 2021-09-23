package FU09_Exercise_Data_Types_and_Variables.more;

import java.util.Arrays;
import java.util.Scanner;

public class p2FromLefttotheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            long[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(e -> Long.parseLong(e)).toArray();
            long max = Math.max(input[0],input[1]);
            long sum = 0;
            while (max > 0) {
                long currentNum = max % 10;
                sum += currentNum;
                max = max / 10;
            }
            System.out.println(sum);
        }


    }
}
