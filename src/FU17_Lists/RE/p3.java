package FU17_Lists.RE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> list2 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> listResult = new ArrayList<>();

        int count = 0;

        boolean isList1IsBigger = false;
        if (list1.size() > list2.size()) {
            isList1IsBigger = true;
        }
        for (int i = 0; i < Math.min(list1.size(),list2.size()) ; i++) {
            listResult.add(list1.get(i));
            listResult.add(list2.get(i));
            count++;
        }
        if (isList1IsBigger) {
            for (int i = count; i < list1.size(); i++) {
                listResult.add(list1.get(i));
            }
        } else {
            for (int i = count; i < list2.size(); i++) {
                listResult.add(list2.get(i));
            }
        }
        for (String result : listResult) {
            System.out.print(result + " ");
        }
    }
}
