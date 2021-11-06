package FU25_Exercise_Associative_Arrays.RE;


import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (true) {
            String[] arr = scanner.nextLine().split(" ");
            String productName = arr[0];
            if (productName.equals("buy")) {
                break;
            }
            double price = Double.parseDouble(arr[1]);
            int quantity = Integer.parseInt(arr[2]);

            if (!productPrice.containsKey(productName)) {
                productPrice.put(productName, price);
                productQuantity.put(productName, quantity);
            } else {
                productPrice.put(productName, price);
                productQuantity.put(productName, productQuantity.get(productName) + quantity);
            }

        }

        for (Map.Entry<String, Double> products : productPrice.entrySet()) {


            String productName = products.getKey();
            double finalSum = products.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }


    }
}
