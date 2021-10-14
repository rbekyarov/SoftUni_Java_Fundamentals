package FU18_Exercise_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> area = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombNum = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bomb = bombNum.get(0);
        int power = bombNum.get(1);

        while (area.contains(bomb)) {
            int specialNumberIndex = area.indexOf(bomb);
            int left = Math.max(0, specialNumberIndex - power);
            int right = Math.min(area.size() - 1, specialNumberIndex + power);

            for (int i = right; i >= left; i--) {
                area.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < area.size(); i++) {
            sum += area.get(i);
        }
        System.out.println(sum);
    }
}
