package FU18_Exercise_List.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (command.get(0)) {
                case "Delete":
                    int valueDelete = Integer.parseInt(command.get(1));
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) == valueDelete) {
                            nums.remove(nums.get(i));
                        }
                    }
                    break;
                case "Insert":
                    if (nums.size() >= Integer.parseInt(command.get(2))) {
                        nums.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
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
