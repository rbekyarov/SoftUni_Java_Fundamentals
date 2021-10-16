package FU19_Exam_Preparation.S03;

import java.util.Scanner;

public class ConterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int countBatle = 0;
        boolean isLoss = false;
        while (!command.equals("End of battle")) {
            countBatle++;
            int batleEnergy = Integer.parseInt(command);
            if (startEnergy <= 0) {
                countBatle--;
                startEnergy = 0;
                isLoss = true;
                break;
            } else if (batleEnergy > startEnergy) {
                startEnergy = 0;
                isLoss = true;
                break;
            } else {
                startEnergy -= batleEnergy;
            }
            if (countBatle % 3 == 0) {
                startEnergy += countBatle;
            }
            command = scanner.nextLine();
        }
        if (isLoss) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countBatle, startEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", countBatle, startEnergy);
        }
    }
}
