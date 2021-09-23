package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p6BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean isOut = false;
        int symbols = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < symbols; i++) {

            String s = scanner.nextLine();
            String inBrackets = "(";
            String outBrackets = ")";

            if (s.equals(inBrackets)) {
                counter++;
            }
            if (s.equals(outBrackets)) {
                counter--;
                if (counter < 0) {
                    isOut = true;
                    break;
                }
            }
        }
        if (isOut) {
            System.out.println("UNBALANCED");
            return;
        }
        if (counter == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
