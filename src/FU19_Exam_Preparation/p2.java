package FU19_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("Go Shopping!")) {
            List<String> command = Arrays.stream(commands.split("\\s+")).collect(Collectors.toList());
            String currentCommand = command.get(0);
            String item = command.get(1);
            switch (currentCommand) {
                case "Urgent":
                    if (!products.contains(item)) {
                        products.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(item)) {
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    if (products.contains(item)) {
                        for (int i = 0; i < products.size(); i++) {
                            if (item.equals(products.get(i))) {
                                products.set(i, command.get(2));
                            }
                        }
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)) {
                        for (int i = 0; i < products.size(); i++) {
                            if (item.equals(products.get(i))) {
                                products.remove(item);
                                products.add(item);
                            }
                        }
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        for (int i = 0; i < products.size(); i++) {
            if (i == products.size() - 1) {
                System.out.print(products.get(i));

            } else {
                System.out.print(products.get(i) + ", ");
            }
        }
    }
}
