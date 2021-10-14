package FU18_Exercise_List.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commands.get(0);
            switch (command) {
                case "Add":
                    nums.add(Integer.parseInt(commands.get(1)));
                    break;
                case "Insert":
                    if (Integer.parseInt(commands.get(2)) > nums.size()) {
                        System.out.println("Invalid index");
                    } else {
                        nums.add(Integer.parseInt(commands.get(2)), Integer.parseInt(commands.get(1)));
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(commands.get(1)) > nums.size()) {
                        System.out.println("Invalid index");
                    } else {
                        nums.remove(Integer.parseInt(commands.get(1)));
                    }
                    break;
                case "Shift":
                    switch (commands.get(1)) {

                        case "left":
                            int countLeft = 0;
                            int shiftLeft = Integer.parseInt(commands.get(2));
                            if (shiftLeft > nums.size()) {
                                System.out.println("Invalid index");
                            } else {
                                for (int i = 0; i < shiftLeft; i++) {
                                    countLeft++;
                                    int firstNum = nums.get(i);
                                    nums.add(firstNum);
                                    nums.remove(0);
                                    i = -1;
                                    if (shiftLeft == countLeft) {
                                        break;
                                    }
                                }
                            }
                            break;
                        case "right":
                            int countRight = 0;
                            int shiftRight = Integer.parseInt(commands.get(2));
                            if (shiftRight > nums.size()) {
                                System.out.println("Invalid index");
                            } else {
                                for (int i = 0; i < shiftRight; i++) {
                                    countRight++;
                                    int lastNum = nums.get(nums.size() - 1);
                                    nums.add(0, lastNum);
                                    nums.remove(nums.size() - 1);
                                    if (shiftRight == countRight) {
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}