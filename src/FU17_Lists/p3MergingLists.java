/*You are going to receive two lists with numbers. Create a result list which contains the numbers from both
 of the lists. The first element should be from the first list, the second from the second list and so on.
 If the length of the two lists are not equal, just add the remaining elements at the end of the list.
•	Read the two lists
        •	Create a result list
        •	Start looping through them until you reach the end of the smallest one
        •	Finally add the remaining elements (if any) to the end of the list*/

package FU17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p3MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " " + list2.get(i) + " ");
            }
        } else {
            int targetList = 0;
            boolean isList1IsLess = false;
            boolean isList2IsLess = false;
            if (list1.size() < list2.size()) {
                targetList = list1.size();
                isList1IsLess = true;
            } else {
                targetList = list2.size();
                isList2IsLess = true;
            }
            for (int i = 0; i < targetList; i++) {
                System.out.print(list1.get(i) + " " + list2.get(i) + " ");

            }
            if (isList1IsLess) {

                for (int i = list2.size() - (list2.size() - list1.size()); i < list2.size(); i++) {
                    System.out.print(list2.get(i) + " ");

                }
            } else if (isList2IsLess) {
                for (int i = list1.size() - (list1.size() - list2.size()); i < list1.size(); i++) {
                    System.out.print(list1.get(i) + " ");

                }
            }
        }

    }
}
