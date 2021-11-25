package FU35_ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_Ad_Astra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> productDate = new LinkedHashMap<>();
        Map<String, Integer> productCalories = new LinkedHashMap<>();
        //String regex = "([#|])(?<nameProduct>[A-Za-z]+[\\s]?[\\w]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>\\d+)\\1";
        String regex = "([#|])(?<nameProduct>[A-Za-z]+[\\s]?[\\w]+)\\1(?<expirationDate>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,4})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String nameProduct = matcher.group("nameProduct");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            if (!productDate.containsKey(nameProduct)) {
                productDate.put(nameProduct, expirationDate);
            }
            if (!productCalories.containsKey(nameProduct)) {
                productCalories.put(nameProduct, calories);
            }
        }
        int totalCalories = 0;
        for (Map.Entry<String, Integer> entry : productCalories.entrySet()) {
            totalCalories += entry.getValue();
        }
        int dayFoods = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", dayFoods);
        for (Map.Entry<String, String> entry : productDate.entrySet()) {
            System.out.printf("Item: %s, Best before: %s,", entry.getKey(), entry.getValue());
            for (Map.Entry<String, Integer> integerEntry : productCalories.entrySet()) {
                if (entry.getKey().equals(integerEntry.getKey())) {
                    System.out.printf(" Nutrition: %d%n", integerEntry.getValue());
                }
            }
        }
    }
}

