package FU20_Mid_Exam;

import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tankNeededXP = Double.parseDouble(scanner.nextLine());
        int battleCount = Integer.parseInt(scanner.nextLine());
        int battleCntr = 0;
        double totalXPcollected = 0.00;
        for (int i = 1; i <= battleCount; i++) {
            battleCntr++;
            double xpPerBattle = Double.parseDouble(scanner.nextLine());

            totalXPcollected += xpPerBattle;

            if (i % 3 == 0) {
                totalXPcollected += xpPerBattle * 0.15;
            }
            if (i % 5 == 0) {
                totalXPcollected -= xpPerBattle * 0.10;
            }
            if (i % 15 == 0) {
                totalXPcollected += xpPerBattle * 0.05;
            }

            if (totalXPcollected >= tankNeededXP) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", battleCntr);
                return;
            }
        }
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", tankNeededXP - totalXPcollected);

    }
}
