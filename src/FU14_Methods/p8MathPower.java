package FU14_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double result = calculatePow( a,b);
        System.out.println(new DecimalFormat( "0.####").format(result));

    }

    private static double calculatePow(double a, double b) {

        return  Math.pow(a,b);
    }
}
