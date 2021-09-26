package FU11_Arrays;

import java.util.Scanner;

public class p1Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNumber > 7 || dayNumber <1 ) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[dayNumber-1]);

            }
        }
    }
