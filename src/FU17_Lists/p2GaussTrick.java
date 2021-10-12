package FU17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        List<Integer> num = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int halfSize = num.size() / 2;// ще итерираме до средата на листа
        for (int i = 0; i < halfSize; i++) {

            int sum = num.get(i) + num.get(num.size() - 1); // събираме 1число с последно
            num.set(i, sum); //задаваме сумата на индекс i
            num.remove(num.size() - 1);//премахваме последния елемент
        }
        for (int number : num) {//разпечатваме получения Лист
            System.out.print(number + " ");
        }
    }
}

