package FU24_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p4WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word =scanner.nextLine().split( " ");//входа го правим в масив
        Arrays.stream(word)//пускаме stream на масива
                .filter(e -> e.length()%2==0)//филтрираме само думите с четна дължина
                .forEach(e->System.out.println(e));//принтираме четните думи

    }
}
