package FU19_Exam_Preparation;


import java.util.*;


public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectors = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double totalBonus = 0;
        double max = Double.NEGATIVE_INFINITY;
        List<Double> bonuses = new ArrayList<>();
        for (int i = 0; i < students; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            totalBonus = 1.0 * attendances / lectors * (5 + initialBonus);
            bonuses.add(Math.ceil(totalBonus));
            if (attendances > max) {
                max = attendances;
            }
        }
        Collections.sort(bonuses);
        Collections.reverse(bonuses);
        for (int i = 0; i <1 ; i++) {
            System.out.printf("Max Bonus: %.0f.%n",bonuses.get(i));
        }
        System.out.printf("The student has attended %.0f lectures.",max);
    }
}
