package FU24_Associative_Arrays.RE;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> mapList = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            double currentElement = nums[i];
            if (!mapList.containsKey(currentElement)) {
                mapList.put(currentElement, 1);
            } else {
                int count = mapList.get(currentElement);
                count++;
                mapList.put(currentElement, count);

            }
        }
        for (Map.Entry<Double, Integer> entry : mapList.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}