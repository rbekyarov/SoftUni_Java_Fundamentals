package FU14_Methods;

import java.util.Scanner;

public class zzzzzzzzp8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double result = calculatePow( a,b);
        printResult(result);

    }

    private static void printResult(double result) {
        if(result%10==0){
            result/=10;
            System.out.printf("%.0f",result);
        } else {
            System.out.println(result);
        }
    }

    private static double calculatePow(double a, double b) {
        double resultPow = Math.pow(a,b);
        return resultPow;
    }
}
