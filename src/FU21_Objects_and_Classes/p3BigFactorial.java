package FU21_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class p3BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger fakturiel = new BigInteger(String.valueOf(1));
        for (int i = 1; i <=n ; i++) {
            fakturiel =   fakturiel.multiply(BigInteger.valueOf(i));

        }
        System.out.println(fakturiel);
    }
}
