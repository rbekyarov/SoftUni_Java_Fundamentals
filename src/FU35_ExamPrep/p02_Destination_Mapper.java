package FU35_ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_Destination_Mapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> destinationList = new ArrayList<>();
        String input = scanner.nextLine();
        String regex ="(?<separator>[\\/=])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
      int points = 0;
        while (matcher.find()){
            String destination = matcher.group("destination");
            points +=destination.length();
            destinationList.add(destination);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinationList));
        System.out.println("Travel Points: "+points);
    }
}
