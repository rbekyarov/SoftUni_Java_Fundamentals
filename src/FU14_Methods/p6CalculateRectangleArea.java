package FU14_Methods;

import java.util.Scanner;

public class p6CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideRectangle1 = Double.parseDouble(scanner.nextLine());
        double sideRectangle2 = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(sideRectangle1, sideRectangle2);
        printResult(area);
    }

    private static double getRectangleArea(double sideRectangle1, double sideRectangle2) {
        return sideRectangle1 * sideRectangle2;
    }

    private static void printResult(double area) {
        System.out.printf("%.0f", area);
    }
}
