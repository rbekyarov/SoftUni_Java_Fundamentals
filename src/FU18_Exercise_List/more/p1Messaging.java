/*
1.	Messaging
        You will be given some list of numbers and a string.
        For each element of the list you have to take the sum of its digits and take the element corresponding to that index from the text.
        If the index is greater than the length of the text, start counting from the beginning (so that you always have a valid index).
        After getting the element from the text, you have to remove the character you have taken from it
        (so for the next index, the text will be with one character less).

        Input                                Output
        9992 562 8933                        hey
        This is some message for you


*/

package FU18_Exercise_List.more;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String[] result = new String[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int sumElement = 0;
            String elementStr = "";
            String currentElement = nums.get(i);
            int[] element = Arrays.stream(currentElement.split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < element.length; j++) {
                sumElement += element[j];
            }
            for (int j = 1; j <= sumElement; j++) {
                count++;
                if (j == text.size()) {
                    j = 0;
                }
                if (count == sumElement) {
                    elementStr = text.get(j);
                    result[i] = elementStr;
                    text.remove(j);
                    break;
                }
            }
        }
        for (String element : result) {
            System.out.print(element);
        }
    }
}

