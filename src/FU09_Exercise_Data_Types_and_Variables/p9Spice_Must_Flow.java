package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p9Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;

        while (yield>=100){
            int totalDayYield =yield-26;
            totalAmount +=totalDayYield ;
            yield -=10;
            days++;
        }
        System.out.println(days);
        if (totalAmount>=26){
            totalAmount-=26;
        }
            System.out.println(totalAmount);


    }
}
