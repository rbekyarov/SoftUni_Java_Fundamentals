/*
1.	Day of Week
        Enter a day number [1…7] and print the day name (in English) or "Invalid day!".
         Use an array of strings.
*/

        package FU11_Arrays;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        if(dayOfWeek<=0||dayOfWeek>7){
            System.out.println("Invalid day!");
        }
        else{
            System.out.println(days[dayOfWeek-1]);
        }

    }
}
