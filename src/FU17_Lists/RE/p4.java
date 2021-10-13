package FU17_Lists.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        operationsList(nums, scanner);
        printList(nums);
    }

    private static List<String> operationsList(List<String> nums, Scanner scanner) {
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> input = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String operate = input.get(0);
            switch (operate) {
                case "Add":
                    nums.add(input.get(1));
                    break;
                case "Remove":
                    nums.remove(String.valueOf(input.get(1)));
                    break;
                case "RemoveAt":
                    nums.remove(Integer.parseInt(input.get(1)));
                    break;
                case "Insert":
                    if (nums.size() >= Integer.parseInt(input.get(2))) {
                        nums.add(Integer.parseInt(input.get(2)), input.get(1));
                    }
            }
            command = scanner.nextLine();
        }
        return nums;
    }
    private static void printList(List<String> nums) {
        System.out.print(String.join(" ", nums));
    }
}
