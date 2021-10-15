/*
02. Array Modifier
        You are given an array with integers. Write a program to modify the elements after receive the commands “swap”, “multiply” or “decrease”.
        •	“swap {index1} {index2}” take two elements and swap their places.
        •	“multiply {index1} {index2}” take element at the 1st index and multiply it with element at 2nd index. Save the product at the 1st index.
        •	“decrease” decreases all elements in the array with 1.
        Input
        On the first input line you will be given the initial array values separated by a single space.
        On the next lines you will receive commands until you receive the command “end”. The commands are as follow:
        •	“swap {index1} {index2}”
        •	“multiply {index1} {index2}”
        •	“decrease”
        Output
        The output should be printed on the console and consist element of the modified array – separated by “, “(comma and single space).
        Constraints
        •	Commands will be: “swap”, “multiply”, “decrease” and “end”
        •	Elements of the array will be integer numbers in the range [-231...231]
        •	Count of the array elements will be in the range [2...100]
        •	Indexes will be always in the range of the array
*/
/*Input            Output
1 2 3 4          1, 11, 3, 0
swap 0 1
swap 1 2
swap 2 3
multiply 1 2
decrease
end*/

package FU19_Exam_Preparation.S02;

import java.util.Arrays;
import java.util.Scanner;

public class p2ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] currentCommand = command.split(" ");

            switch (currentCommand[0]) {
                case "swap":
                    int indexA = Integer.parseInt(currentCommand[1]);
                    int indexB = Integer.parseInt(currentCommand[2]);
                    int value1 = nums[indexA];
                    int value2 = nums[indexB];
                    int valueTemp = value1;
                    nums[indexA] = value2;
                    nums[indexB] = valueTemp;
                    break;
                case "multiply":
                    indexA = Integer.parseInt(currentCommand[1]);
                    indexB = Integer.parseInt(currentCommand[2]);
                    int value = nums[indexA] * nums[indexB];
                    nums[indexA] = value;

                    break;
                case "decrease":
                    for (int i = 0; i < nums.length; i++) {
                        int temp2 = nums[i] - 1;
                        nums[i] = temp2;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        String[] out = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String temp = "" + nums[i];
            out[i] = temp;
        }
        System.out.println(String.join(", ", out));
        System.out.println(Arrays.toString(nums).replaceAll("[\\[\\]]", ""));
    }
}
