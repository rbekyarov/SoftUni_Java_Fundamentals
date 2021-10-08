package FU14_Methods;

import java.util.Scanner;

public class p4Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //("add", "multiply", "subtract", "divide")
        String operation = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                addOperate(number1, number2);
                break;
            case "multiply":
                multiplyOperate(number1, number2);
                break;
            case "subtract":
                subtractOperate(number1, number2);
                break;
            case "divide":
                divideOperate(number1, number2);
                break;

        }
    }

    private static void addOperate(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void multiplyOperate(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void subtractOperate(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void divideOperate(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
