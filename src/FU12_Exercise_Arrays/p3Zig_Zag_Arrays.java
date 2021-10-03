package FU12_Exercise_Arrays;

import java.util.Scanner;

public class p3Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[1]);
            if ((i + 1) % 2 == 0) {
                arr1[i] = secondNum;
                arr2[i] = firstNum;
            } else {
                arr1[i] = firstNum;
                arr2[i] = secondNum;
            }
        }
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
