package FU18_Exercise_List.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cardsPlayer2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true){

        }
    }
}
