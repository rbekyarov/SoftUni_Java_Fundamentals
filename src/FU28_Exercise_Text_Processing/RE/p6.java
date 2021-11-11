package FU28_Exercise_Text_Processing.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> charList = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());
        for (int i = 0; i < charList.size() - 1; i++) {
            if (charList.get(i).equals(charList.get(i + 1))) {
                charList.remove(i + 1);
                i--;
            }
        }
        System.out.println(String.join("", charList));
    }
}
