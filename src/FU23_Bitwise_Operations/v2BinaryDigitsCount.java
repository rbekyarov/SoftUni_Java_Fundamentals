package FU23_Bitwise_Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class v2BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); //число за преобразуване в двоична бр. с-ма
        List<Integer> result = new ArrayList<>();
        while (number != 0) {

            int leftOver = number % 2;
            result.add(leftOver);
            number = number / 2;
        }
        Collections.reverse(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + "");

        }
    }
}