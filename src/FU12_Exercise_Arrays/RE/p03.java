/*
3.	Zig-Zag Arrays
        Write a program which creates 2 arrays. You will be given an integer n.
        On the next n lines, you get 2 integers. Form 2 arrays as shown below.

Input     Output
4        1 10 31 20
1 5      5 9 81 41
9 10
31 81
41 20
*/

package FU12_Exercise_Arrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int[] currentArrInput = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                arr1[i] = currentArrInput[0];
                arr2[i] = currentArrInput[1];
            } else {
                arr1[i] = currentArrInput[1];
                arr2[i] = currentArrInput[0];
            }
        }
        for (int e : arr1) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : arr2) {
            System.out.print(e + " ");
        }
    }
}
