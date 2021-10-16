package FU19_Exam_Preparation.S04;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int employeeEfficiency = scan.nextInt() + scan.nextInt() + scan.nextInt();

        int studentsCount = scan.nextInt();
        int hours = 0;

        while (studentsCount > 0) {
            hours++;
            if (hours % 4 != 0) {
                studentsCount -= employeeEfficiency;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
