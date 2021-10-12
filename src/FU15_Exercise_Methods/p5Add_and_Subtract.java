package FU15_Exercise_Methods;

import java.util.Scanner;

public class p5Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1= Integer.parseInt(scanner.nextLine());
        int num2= Integer.parseInt(scanner.nextLine());
        int num3= Integer.parseInt(scanner.nextLine());

        int sum = getSumNum1Num2(num1,num2);
        int result = sum - num3;
        System.out.println(result);



    }

    private static int getSumNum1Num2(int num1, int num2) {
        return num1+num2;
    }
}
