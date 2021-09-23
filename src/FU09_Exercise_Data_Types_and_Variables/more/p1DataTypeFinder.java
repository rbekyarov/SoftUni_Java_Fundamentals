package FU09_Exercise_Data_Types_and_Variables.more;

import java.util.Scanner;

public class p1DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isInt = true;
            try {
                int integer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }
            boolean isDouble = true;
            try {
                double floatingPoint = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }
            if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
