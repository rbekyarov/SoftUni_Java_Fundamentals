package FU14_Methods;

import java.util.Scanner;

public class p11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        switch (operator) {
            case "+":
                int resultAdd = getResultAdd(num1, num2);
                System.out.println(resultAdd);
                break;
            case "-":
                int resultSubtract = getResultSubtract(num1, num2);
                System.out.println(resultSubtract);
                break;
            case "*":
                int resultMultiply = getResultMultiply(num1, num2);
                System.out.println(resultMultiply);
                break;
            case "/":
                int resultDivide = getResultDivide(num1, num2);
                System.out.println(resultDivide);
                break;


        }
    }

    private static int getResultAdd(int num1, int num2) {
        return num1 + num2;
    }

    private static int getResultSubtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int getResultMultiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int getResultDivide(int num1, int num2) {
        return num1 / num2;
    }
}
