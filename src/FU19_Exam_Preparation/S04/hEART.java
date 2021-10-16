package FU19_Exam_Preparation.S04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hEART {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        int currentJump = 0;

        while (!command[0].equals("Love!")) {
            int jump = Integer.parseInt(command[1]);
            if (jump + currentJump > houses.size() - 1) {
                currentJump = 0;
                houses.set(currentJump, houses.get(currentJump) - 2);
            } else {
                currentJump += jump;
                houses.set(currentJump, houses.get(currentJump) - 2);
            }
            if (houses.get(currentJump) == 0) {
                System.out.println("Place " + currentJump + " has Valentine's day.");
            } else if (houses.get(currentJump) < 0) {
                System.out.println("Place " + currentJump + " already had Valentine's day.");

            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println("Cupid's last position was " + currentJump + ".");


        int counter = 0;
        for (Integer house : houses) {
            if (house > 0) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Cupid has failed " + counter + " places.");
        } else {
            System.out.println("Mission was successful.");
        }
    }
}
