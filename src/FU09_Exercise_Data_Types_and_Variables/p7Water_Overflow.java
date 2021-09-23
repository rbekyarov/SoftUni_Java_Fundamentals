package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p7Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int capacityTank = 255;
        int sum = 0;
        for (int i = 0; i < times; i++) {

            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (currentLiters > capacityTank) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                sum += currentLiters;
                capacityTank -= currentLiters;
            }
        }
        System.out.print(sum);
    }
}
