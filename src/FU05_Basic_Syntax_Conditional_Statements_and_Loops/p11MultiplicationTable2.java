package FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());


        for (int i = start; i <=10 ; i++) {

                int result = num*i;
                System.out.printf("%d X %d = %d\n", num,i,result);

        }
        if (start>10){
            int result = num*start;
            System.out.printf("%d X %d = %d\n", num,start,result);
        }

    }
}
