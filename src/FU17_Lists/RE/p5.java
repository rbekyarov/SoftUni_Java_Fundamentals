package FU17_Lists.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nums = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> operators = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String operator = operators.get(0);
            switch (operator) {
                case "Contains":
                    if (nums.contains(operators.get(1))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (operators.get(1).equals("even")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (Integer.parseInt(nums.get(i)) % 2 == 0) {
                                System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                        }
                    } else {
                        for (int i = 0; i < nums.size(); i++) {
                            if (Integer.parseInt(nums.get(i)) % 2 == 1) {
                                System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < nums.size(); i++) {
                        sum += Integer.parseInt(nums.get(i));
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String sign = operators.get(1);
                    switch (sign) {
                        case ">=":
                            for (int i = 0; i < nums.size(); i++) {
                                if (Integer.parseInt(nums.get(i)) >= Integer.parseInt(operators.get(2)))
                                    System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                            break;
                        case "<":
                            for (int i = 0; i < nums.size(); i++) {
                                if (Integer.parseInt(nums.get(i)) < Integer.parseInt(operators.get(2)))
                                    System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                            break;
                        case ">":
                            for (int i = 0; i < nums.size(); i++) {
                                if (Integer.parseInt(nums.get(i)) > Integer.parseInt(operators.get(2)))
                                    System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                            break;
                        case "<=":
                            for (int i = 0; i < nums.size(); i++) {
                                if (Integer.parseInt(nums.get(i)) <= Integer.parseInt(operators.get(2)))
                                    System.out.print(Integer.parseInt(nums.get(i)) + " ");
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}