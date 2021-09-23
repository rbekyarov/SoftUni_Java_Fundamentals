package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity  = Integer.parseInt(scanner.nextLine());
        //17,3

        if (persons % capacity ==0 ){
            double courses = (1.0*persons / capacity);
            System.out.printf("%.0f",courses);
        } else {
            double courses = (1.0*persons / capacity) ;
            double coursesTotal = Math.ceil(courses);
            System.out.printf("%.0f",coursesTotal);
        }
    }
}
