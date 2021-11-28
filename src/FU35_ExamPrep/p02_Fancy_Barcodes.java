package FU35_ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_Fancy_Barcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBarcodes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countBarcodes; i++) {

            String input = scanner.nextLine();
            String regex = "@#+[A-Z](?<number>([A-Za-z]|[0-9]){4,})[A-Z]@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder productGroup = new StringBuilder();
            if (matcher.find()) {
                String currentMatch = matcher.group("number");
                for (int j = 0; j < currentMatch.length(); j++) {
                    char symbol = currentMatch.charAt(j);
                    if (Character.isDigit(symbol)) {
                        productGroup.append(symbol);
                    }
                }
                if (productGroup.length()<1) {
                    productGroup.append("00");
                }
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
