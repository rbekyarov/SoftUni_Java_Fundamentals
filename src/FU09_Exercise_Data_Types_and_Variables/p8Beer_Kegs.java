package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p8Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        double max = Double.NEGATIVE_INFINITY;
        String modelMax = "";
        for (int i = 0; i <times ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI*Math.pow(radius,2)*height;
            if (max<volume){
                max=volume;
                modelMax = model;
            }

        }
        System.out.println(modelMax);
    }
}
