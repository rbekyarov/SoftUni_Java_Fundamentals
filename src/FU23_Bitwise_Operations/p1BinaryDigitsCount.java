package FU23_Bitwise_Operations;

import java.util.Scanner;

public class p1BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); //число за преобразуване в двоична бр. с-ма
        int binaryNumber = Integer.parseInt(scanner.nextLine()); //число, което търся в преобразуваното
        int count = 0; //броя на двоичното число
        while (number != 0) {
            int leftOver = number % 2;
            if (leftOver == binaryNumber){
                count++;
            }
            number = number / 2; //number /= 2
        }
        System.out.println(count);

    }
}