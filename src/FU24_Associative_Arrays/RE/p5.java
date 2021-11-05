package FU24_Associative_Arrays.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a,b)->b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer e :listNums){
            System.out.print(e + " ");
        }
    }
}