package FU24_Associative_Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p1CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double[] nums = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> mapNumbers = new TreeMap<>();

        for (double number : nums) {
            if (!mapNumbers.containsKey(number)) {
                mapNumbers.put(number, 1);
            } else {//ако сме срещали числото увеличаваме броя пъти
                int count = mapNumbers.get(number);
                count++;
                mapNumbers.put(number, count);
            }
        }
        for (Map.Entry<Double, Integer> entry : mapNumbers.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}