package FU17_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums.remove(i);
                i--;
            }
        }
        Collections.reverse(nums);
        if (nums.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < nums.size(); i++) {
                System.out.print(nums.get(i) + " ");

            }
        }
    }
}
