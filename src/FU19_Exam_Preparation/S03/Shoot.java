package FU19_Exam_Preparation.S03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int targets = 0;
        while (!input.equals("End")) {
            targets++;
            int indexInput = Integer.parseInt(input);
            if (indexInput > (nums.size() - 1)) {
                input = scanner.nextLine();
                targets--;
                continue;
            }
            int shoot = nums.get(indexInput);
            nums.set(indexInput, -1);
            for (int i = 0; i < nums.size(); i++) {

                if (shoot < nums.get(i)) {
                    nums.set(i, nums.get(i) - shoot);
                } else if (shoot >= nums.get(i) && nums.get(i) != -1) {
                    nums.set(i, nums.get(i) + shoot);
                }
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + targets + " -> ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
