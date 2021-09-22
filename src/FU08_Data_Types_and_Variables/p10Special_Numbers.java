package FU08_Data_Types_and_Variables;

import java.util.Scanner;

public class p10Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //5, 7 or 11.
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int num = 1; num <= n; num++) {
            int number = num;
            while (number > 0) { // вземаме всяко последно число
                int curentNum = number % 10;
                sum = sum + curentNum;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(num + " -> " + "True");
            } else {
                System.out.println(num + " -> " + "False");
            }
            sum = 0;
        }
    }
}
