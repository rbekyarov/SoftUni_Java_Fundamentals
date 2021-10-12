/*
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
        Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
        Print even – print all the numbers that are even separated by a space
        Print odd – print all the numbers that are odd separated by a space
        Get sum – print the sum of all the numbers
        Filter ({condition} {number}) – print all the numbers that fulfill that condition.
        The condition will be either '<', '>', ">=", "<="

       Input                   Output
2 13 43 876 342 23 543          No such number
        Contains 100            Yes
        Contains 543            2 876 342
        Print even              13 43 23 543
        Print odd               1842
        Get sum                 43 876 342 543
        Filter >= 43            2 13 43 23
        Filter < 100
        end
*/
package FU17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Contains":
                    if (nums.contains(Integer.parseInt(command[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 == 0) {
                                System.out.print(nums.get(i) + " ");
                                //System.out.println();
                            }
                        }
                    }
                    if (command[1].equals("odd")) {
                        System.out.println();
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 == 1) {

                                System.out.print(nums.get(i) + " ");
                            }
                        }
                    }
                    break;
                case "Get":
                    if (command[1].equals("sum")){
                    int sum = 0;
                    for (int i = 0; i < nums.size(); i++) {

                        sum += nums.get(i);
                    }
                    System.out.println();
                    System.out.println(sum);
                    }
                    break;
                case "Filter":

                    if (command[1].equals(">")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) > Integer.parseInt(command[2])) {
                                System.out.print(nums.get(i) + " ");
                            }
                        }
                    } else if (command[1].equals("<")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) < Integer.parseInt(command[2])) {
                                System.out.print(nums.get(i) + " ");
                            }
                        }
                    } else if (command[1].equals(">=")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) >= Integer.parseInt(command[2])) {
                                System.out.print(nums.get(i) + " ");
                            }
                        }
                    } else if (command[1].equals("<=")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) <= Integer.parseInt(command[2])) {
                                System.out.print(nums.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
