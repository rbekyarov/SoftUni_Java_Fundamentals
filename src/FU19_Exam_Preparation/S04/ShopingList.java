package FU19_Exam_Preparation.S04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShopingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        int index = 0;
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {

            String[] productArr = command.split(" ");
            if (productArr[0].equals("Urgent")) {
                if (!products.contains(productArr[1])) {
                    products.add(productArr[1]);
                }

            } else if (productArr[0].equals("Unnecessary")) {
                if (products.contains(productArr[1])) {
                    products.remove(productArr[1]);
                }

            } else if (productArr[0].equals("Rearrange")) {
                if (products.contains(productArr[1])) {
                    products.remove(productArr[1]);
                    products.add(products.size() - 1, productArr[1]);
                }
            }
            if (productArr[0].equals("Correct")) {
                if (products.contains(productArr[1])) {
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).equals(productArr[1])) {
                            index = i;
                        }

                    }
                    products.set(index, productArr[2]);
                }
            }
            command = scanner.nextLine();
        }

            System.out.print(String.join(", ",products));

    }
}
