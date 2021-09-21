package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p9PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double students = Math.ceil(countStudents + countStudents * 0.1);
        double priceForLightsaber = students * lightsaberPrice;
        double priceForRobe = countStudents * robePrice;
        double priceForBelts = 0;
        if (countStudents > 5) {
            double countBeltFree = Math.floor(countStudents / 6.0);
            priceForBelts = (countStudents - countBeltFree) * beltPrice;
        } else {
            priceForBelts = countStudents * beltPrice;
        }
        double priceTotal = priceForLightsaber + priceForRobe + priceForBelts;
        if (budget >= priceTotal) {
            System.out.printf("The money is enough - it would cost %.2flv.", priceTotal);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", priceTotal - budget);
        }
    }
}
