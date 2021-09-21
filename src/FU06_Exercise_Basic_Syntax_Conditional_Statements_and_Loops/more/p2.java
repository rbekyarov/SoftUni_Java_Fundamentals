package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops.more;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//zero, one, two, three, four, five, six, seven, eight, nine
        List<Integer> number = Arrays.stream(scanner.nextLine()
                .split("")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int lastNumber = 0;
        for (int i = 0; i < number.size(); i++) {
            lastNumber = number.get(number.size() - 1);
        }
        switch (lastNumber) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 0:
                System.out.println("zero");
                break;

        }
        /*int number = Integer.parseInt(scanner.nextLine());

        switch (number % 10) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }*/
    }
}
