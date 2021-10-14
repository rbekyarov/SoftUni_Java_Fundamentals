/*
3.	House Party
        Write a program that keeps track of the guests that are going to a house party.
        On the first input line you are going to receive how many commands you are going to have.
         On the next lines you are going to receive some of the following inputs:
        •	"{name} is going!"
        •	"{name} is not going!"
        If you receive the first type of input, you have to add the person if he/she is not in the list.
        (If he/she is in the list print on the console: "{name} is already in the list!").
        If you receive the second type of input, you have to remove the person if he/she is in the list.
        (If not print: "{name} is not in the list!"). At the end print all guests.

Input:              Output:
5                   Tom is already in the list!
Tom is going!       Tom
Annie is going!     Annie
Tom is going!       Garry
Garry is going!     Jerry
Jerry is going!
*/

package FU18_Exercise_List.RE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> visitors = new ArrayList<>();
        printFinalVisitorsList(addOrRemoveVisitorsInTheParty(visitors, scanner));
    }

    private static List<String> addOrRemoveVisitorsInTheParty(List<String> visitors, Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String name = list.get(0);
            String command = list.get(2);
            switch (command) {
                case "going!":
                    if (!visitors.contains(name)) {
                        visitors.add(name);
                        continue;
                    } else {

                        System.out.printf("%s is already in the list!", name);
                        System.out.println();
                    }
                    break;
                case "not":
                    if (visitors.contains(name)) {
                        visitors.remove(String.valueOf(name));
                        continue;
                    } else {
                        System.out.printf("%s is not in the list!", name);
                        System.out.println();
                    }
                    break;
            }
        }
        return visitors;
    }

    private static void printFinalVisitorsList(List<String> visitors) {
        for (String name : visitors) {
            System.out.println(name + " ");
        }
    }
}

