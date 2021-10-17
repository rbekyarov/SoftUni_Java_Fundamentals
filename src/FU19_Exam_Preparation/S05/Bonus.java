package FU19_Exam_Preparation.S05;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studenst = Integer.parseInt(scanner.nextLine());
        int labsCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double totalBonus = 0;
        double[] result = new double[2];
        for (int i = 0; i < studenst; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            totalBonus = Math.ceil((1.0 * attendances / labsCount) * (5 + additionalBonus));
            if (result[0] < totalBonus) {
                result[0] = totalBonus;
            }
            if (result[1] < attendances) {
                result[1] = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n", result[0]);
        System.out.printf("The student has attended %.0f lectures.", result[1]);
    }
}
