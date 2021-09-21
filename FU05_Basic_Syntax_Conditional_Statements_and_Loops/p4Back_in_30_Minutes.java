package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p4Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes +30;
        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
        if (minutes < 10) {
            System.out.printf("%s:0%s", hours, minutes);

        } else {
            System.out.printf("%s:%s", hours, minutes);
        }
    }
}
