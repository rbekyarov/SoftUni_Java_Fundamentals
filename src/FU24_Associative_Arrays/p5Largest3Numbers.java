package FU24_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p5Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // входа го импортваме в масив
        String[] nums = scanner.nextLine().split(" ");
        // пускаме stream
        Arrays.stream(nums).map(Integer::parseInt)//превръщаме в голям Integer
                .sorted((left, right) -> right.compareTo(left))// сортираме по големина
                .limit(3)//хващаме първите 3 сортирани елемента
                .forEach(s -> {  // принтираме всеки елемент с интервал
            System.out.print(s);
            System.out.print(" ") ;});
    }
}
