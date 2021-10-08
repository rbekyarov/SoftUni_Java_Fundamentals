package FU15_Exercise_Methods;

import java.util.Scanner;

public class p8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double resultTotal = factorialNum(num1)/factorialNum(num2);
        System.out.printf("%.2f",resultTotal);

    }
    private static double factorialNum(double num) {
        int result=1;
        for (int i = 1; i <=num ; i++) {
            result *=i;
        }return result;
    }
}
