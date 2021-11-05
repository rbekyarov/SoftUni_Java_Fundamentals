package FU25_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p4Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer>  productQuantity = new LinkedHashMap<>();
        Map<String, Double>  productPrice = new LinkedHashMap<>();
        while (!input.equals("buy")){

            String[] inputInfo = input.split(" ");
            String product = inputInfo[0];
            double price = Double.parseDouble(inputInfo[1]);
            int quantity =Integer.parseInt(inputInfo[2]) ;

            productQuantity.putIfAbsent(product, 0);
            productQuantity.put(product, productQuantity.get(product) + quantity);

            productPrice.putIfAbsent(product, productQuantity.get(product) * price);
            productPrice.put(product, price * productQuantity.get(product));


            input = scanner.nextLine();
        }
        productPrice.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }

}
