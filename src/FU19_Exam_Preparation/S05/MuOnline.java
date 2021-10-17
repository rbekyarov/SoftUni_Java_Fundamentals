package FU19_Exam_Preparation.S05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int health = 100;
        int overHealh = 0;
        int bitcoin = 0;
        int bestRound = 0;
        boolean isDied = false;
        for (int i = 0; i < rooms.size(); i++) {
            bestRound++;
            String[] data = rooms.get(i).split(" ");
            String command = data[0];
            int value = Integer.parseInt(data[1]);
            if (!(command.equals("potion")) && !(command.equals("chest"))) {
                health -= value;
                if (health <= 0) {
                    isDied = true;
                    break;
                }
                System.out.printf("You slayed %s.\n", command);
            } else {
                if (command.equals("potion")) {
                    int correntHealt = health;
                    health += value;


                    if (health > 100) {
                        health = 100;
                        System.out.printf("You healed for %d hp.\n", 100-correntHealt);
                    }else {
                        System.out.printf("You healed for %d hp.\n", value);
                    }

                    System.out.printf("Current health: %d hp.\n", health);

                }
                if (command.equals("chest")) {
                    bitcoin += value;
                    System.out.printf("You found %d bitcoins.\n", value);

                }
            }

        }
        if (isDied) {
            System.out.println("You died! Killed by boss.");
            System.out.printf("Best room: %d\n", bestRound);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", bitcoin);
            System.out.printf("Health: %d", health);

        }
    }
}
