package FU19_Exam_Preparation.S03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");
        String command = commands[0];
        int index = Integer.parseInt(commands[1]);
        int value = Integer.parseInt(commands[2]);
        while (!command.equals("End")) {
            switch (command) {
                case "Shoot":
                    if (index <= nums.size()) {
                        nums.set(index, nums.get(index) - value);
                        if (nums.get(index) <= 0) {
                            nums.remove(index);
                        }
                    }
                    break;
                case "Strike":
                    if (index < nums.size() && index > 0) {
                        nums.remove(index + 1);
                        nums.remove(index);
                        nums.remove(index - 1);

                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
                case "Add":
                    if (index <= nums.size()) {
                        nums.add(index, value);
                    } else {
                        System.out.print("Invalid placement!\n");
                    }
                    break;
            }


            commands = scanner.nextLine().split(" ");
            command = commands[0];
            if (command.equals("End")) {
                break;
            }
            index = Integer.parseInt(commands[1]);
            value = Integer.parseInt(commands[2]);
        }
        for (int i = 0; i < nums.size(); i++) {
            if (i != nums.size() - 1) {
                System.out.print(nums.get(i) + "|");
            } else
                System.out.print(nums.get(i));


        }
    }
}
