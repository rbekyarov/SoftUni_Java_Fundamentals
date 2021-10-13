package FU17_Lists.RE;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        operateList(nums);
        printList(nums);
    }

    public static List<Double> operateList(List<Double> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                list.set(i, list.get(i) + list.get(i + 1));
                list.remove(i + 1);
                i = -1;
            }
        }
        return list;
    }

    private static void printList(List<Double> nums) {
        DecimalFormat decimal = new DecimalFormat("0.#");
        for (double decimalNum : nums) {
            System.out.print(decimal.format(decimalNum) + " ");
        }
    }
}
