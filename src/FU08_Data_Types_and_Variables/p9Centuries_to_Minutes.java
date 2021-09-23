package FU08_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class p9Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        // 1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes

        BigDecimal years = new BigDecimal(centuries*100);

        BigDecimal days = new BigDecimal(365.2422);
        days = days.multiply(years);
        BigDecimal hours = new BigDecimal(  24);
        hours = hours.multiply(days);
        BigDecimal minutes = new BigDecimal( 60);
        minutes = minutes.multiply(hours);


        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes"
                ,centuries,years,days,hours,minutes);
    }
}
