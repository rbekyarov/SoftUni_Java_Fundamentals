package FU17_Lists.RE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            list.add(input);
        }
        Collections.sort(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,list.get(i));
        }
    }
}
