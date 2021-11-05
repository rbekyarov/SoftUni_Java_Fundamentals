package FU24_Associative_Arrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Arrays.stream(input).filter(e->e.length()%2==0)
                .forEach(e-> System.out.println(e));
    }
}
