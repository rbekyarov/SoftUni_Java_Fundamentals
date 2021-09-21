package FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum =0;
        int count = 0;
        for (int i = 1; i <=num*num ; i+=2) {
            System.out.println(i);
            sum +=i;
            count++;
            if (count==num){
                break;
            }
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
