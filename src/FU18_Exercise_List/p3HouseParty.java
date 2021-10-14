package FU18_Exercise_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(0, "");
            String[] command = scanner.nextLine().split(" ");
            if (command.length == 3) {

                for (int j = 0; j < people.size(); j++) {

                    if (command[0].equals(people.get(i)) || people.contains(command[0])) {
                        System.out.printf("%s is already in the list!\n", command[0]);
                    } else {
                        people.add(command[0]);
                    }
                    break;
                }

            } else {

                if (people.contains(command[0])) {
                    people.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!\n", command[0]);
                }
            }
        }

        for (int i = n; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
