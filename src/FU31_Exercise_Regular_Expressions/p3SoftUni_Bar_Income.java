package FU31_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p3SoftUni_Bar_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$$";
        Pattern pattern = Pattern.compile(regex);
        String command = scanner.nextLine();

        double totalPrice = 0;
        while (!command.equals("end of shift")) {

            Matcher matcher = pattern.matcher(command);
            while (matcher.find()) {
                double priceProducts = Integer.parseInt(matcher.group("quantity")) * Double.parseDouble(matcher.group("price"));
                totalPrice += priceProducts;
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"),priceProducts);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
