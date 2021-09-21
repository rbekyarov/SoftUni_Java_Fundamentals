package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops.more;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p1SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            int num =Integer.parseInt(scanner.nextLine());
            nums.add(num);
        }
        Collections.sort(nums);
        for (int i = nums.size()-1; i >=0 ; i--) {
            System.out.println(nums.get(i));

        }
    }
}
