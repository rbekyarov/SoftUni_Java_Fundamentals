package FU31_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p1Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Bought furniture:");
        double totalPrice = 0;

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){

                System.out.println(matcher.group("furniture"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double resultPrice = price*quantity;
                totalPrice +=resultPrice;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
