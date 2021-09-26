package FU11_Arrays;

import java.util.Scanner;

public class p2Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNum = Integer.parseInt(scanner.nextLine());
        int[] array = new int[countNum];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%d ",array[i]);
        }
    }
}
