package FU12_Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        int num = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==magicSum)
                    System.out.println(arr[i] + " "+arr[j]);
            }
        }
    }
}
