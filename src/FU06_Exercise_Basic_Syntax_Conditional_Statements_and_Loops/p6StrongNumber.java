package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int realnumber = number;
        int factSum = 1;
        while (number!=0){
            int lastDigit = number %10;
            int fact = 1;

            for (int i = lastDigit; i >0 ; i--) {
                 fact *=i;

            }
            factSum +=fact;
            number /=10;
        }
        if (factSum-1 == realnumber ){
            System.out.println("yes");

        }else {
            System.out.println("no");
        }

    }
}
