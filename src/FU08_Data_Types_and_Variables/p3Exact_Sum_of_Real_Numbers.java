package FU08_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class p3Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum= new BigDecimal(0);
        for (int i = 1; i <=n ; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
