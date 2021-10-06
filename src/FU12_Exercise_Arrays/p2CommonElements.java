package FU12_Exercise_Arrays;

import java.util.Scanner;

public class p2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");
        int n = 0;
        if (array1.length < array2.length) {
            n = array1.length;
        } else {
            n = array2.length;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].equals(array1[j])) {
                    System.out.print(array2[i] + " ");
                }
            }
        }
    }
}
