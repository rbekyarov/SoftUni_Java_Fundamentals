package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p1Integer_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int sum12 = num1+num2;
        int divide = sum12/num3;
        int result = divide*num4;
        System.out.println(result);
    }
}
