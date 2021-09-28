package FU11_Arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String numbers = "2 6 99 34 45";
        String[] nums = numbers.split(" ");
        int[] n = new int[nums.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(nums[i]);
        }
        int[] n1 = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] n2 = new int [n.length];
        for (int i = 0; i <n2.length ; i++) {
            n2[i]=n[i]*n1[i];
        }
        System.out.println();
    }
}
