package FU30_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p3MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\b(?<day>[\\d]{2})(?<separator>[.\\/-])(?<mount>[A-Z][a-z]+)\\2(?<year>[\\d]{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(input);

        while (dates.find()) {
            String day = dates.group("day");
            String mount = dates.group("mount");
            String year = dates.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, mount, year);
        }

    }
}
