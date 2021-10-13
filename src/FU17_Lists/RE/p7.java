package FU17_Lists.RE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)<0){
                nums.remove(nums.get(i));
                i=-1;
            }
        }
        if (nums.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(nums);
            for (int e:nums){
                System.out.print(e+" ");
            }
        }
    }
}
