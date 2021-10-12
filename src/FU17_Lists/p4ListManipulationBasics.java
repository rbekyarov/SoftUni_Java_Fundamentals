package FU17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    nums.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    nums.remove(Integer.valueOf(command[1]));
                    break;
                case "RemoveAt":
                    nums.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    nums.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            input = scanner.nextLine();

        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");

        }
    }
}
