package FU08_Data_Types_and_Variables;

import java.util.Scanner;

public class p2Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dolars = Double.parseDouble(scanner.nextLine());
        double paunds = dolars*1.36;
        System.out.printf("%.3f",paunds);
    }
}
