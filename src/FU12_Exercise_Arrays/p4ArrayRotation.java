package FU12_Exercise_Arrays;

import java.util.Scanner;

public class p4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String firstElement = arr[0]; //вземаме и съхраняваме първия елемент от масива

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];//местим всеки елемент с 1 позиция назад
            }
            arr[arr.length - 1] = firstElement;
        }
        for (String num : arr) {
            System.out.print(num + " ");

        }

    }
}
