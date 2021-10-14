package FU18_Exercise_List.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> weapon = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bomb = weapon.get(0);
        int power = weapon.get(1);
        for (int i = 0; i < targets.size(); i++) {

            if (targets.get(i) == bomb) {
                int startIndex = i - power;
                if (startIndex <=0) {
                    startIndex = 0;
                }
                int endIndex = i + power;
                if (endIndex >= targets.size()) {
                    endIndex = targets.size() - 1;
                }
                for (int j = endIndex; j >= startIndex; j--) {

                    targets.remove(j);
                }
            }
        }
        int sum = 0;
        for (int target : targets) {
            sum += target;
        }
        System.out.println(sum);
    }
}
