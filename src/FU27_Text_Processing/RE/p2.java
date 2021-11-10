package FU27_Text_Processing.RE;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String e: input){
            for (int i = 0; i <e.length() ; i++) {
                result.append(e);
            }
        }
        System.out.println(result);
    }
}
