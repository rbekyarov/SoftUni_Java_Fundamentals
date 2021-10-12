package FU15_Exercise_Methods;

import java.util.Scanner;

public class p1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = Integer.parseInt(scanner.nextLine());
        int value2 = Integer.parseInt(scanner.nextLine());
        int value3 = Integer.parseInt(scanner.nextLine());
        checkSmallestNumbers (value1,value2,value3);
        }

    private static void checkSmallestNumbers(int value1, int value2, int value3) {
        if (value1<value2 && value1<value3){
            System.out.println(value1);
        } else if (value2<value1 && value2<value3){
            System.out.println(value2);
        }else {
            System.out.println(value3);
        }
    }

}
