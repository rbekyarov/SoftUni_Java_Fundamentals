package FU17_Lists.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        operateList(nums);
        printList(nums);
    }

    private static void printList(List<Integer> nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> operateList(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size() - 1);
        }
        return nums;
    }
}
