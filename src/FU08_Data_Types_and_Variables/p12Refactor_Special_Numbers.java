package FU08_Data_Types_and_Variables;

import java.util.Scanner;

public class p12Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        for (int num = 1; num <= number; num++) {
            int sum = 0;
            int digit = num;
            String bool = "";
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum){
                 bool = "True";
            } else {
                 bool = "False";
            }
            System.out.printf("%d -> %s%n", digit, bool);
            sum = 0;
            num = digit;
        }
    }
}
