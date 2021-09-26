package FU11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p5Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        int[] num = Arrays.stream(numbers).mapToInt(value -> Integer.parseInt(value)).toArray();
        int sumEven = 0;
        int sumODD = 0;
        for (int i = 0; i <num.length ; i++) {
            if (num[i]%2==0){
                sumEven +=num[i];
            } else {
                sumODD +=num[i];
            }
        }
        System.out.println(sumEven-sumODD);
    }
}
