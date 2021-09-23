package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p2Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num!=0){
             int curentNum= num%10;
             sum +=curentNum;
             num = num/10;

        }
        System.out.println(sum);
    }
}
