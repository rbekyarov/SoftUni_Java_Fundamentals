/*
03. Numbers
        Write a program to read a sequence of integers and find and print the top 5 numbers that are greater than the average value in the sequence,
        sorted in descending order.
        Input
        Read from the console a single line holding space separated number.
        Output
        Print the above described numbers on a single line, space separated.
        If less than 5 numbers hold the above mentioned property, print less than 5 numbers.
        Print “No” if no numbers hold the above property.
*/
/*
Input                   Output
10 20 30 40 50          50 40
-1 -2 -3 -4 -5 -6       -1 -2 -3
1                       No
*/

package FU19_Exam_Preparation.S02;

import java.util.*;
import java.util.stream.Collectors;

public class p3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        if (nums.size() <= 1) {
            System.out.println("No");
            return;
        }
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        if (sum == 0){
            System.out.println("No");
            return;
        }
        double average = 1.0 * sum / nums.size();
        List<Integer> out = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) > average) {
                out.add(nums.get(i));
            }else if (nums.get(i) == average) {
                count++;
            }
            if (count ==nums.size()) {
                System.out.println("No");
            }
        }
        Collections.sort(out);
        Collections.reverse(out);
        for (int i = 0; i < out.size(); i++) {
            if (i <= 4) {
                System.out.print(out.get(i) + " ");
            }
        }
    }
}