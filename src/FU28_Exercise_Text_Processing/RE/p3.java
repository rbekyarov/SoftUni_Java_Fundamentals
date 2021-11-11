package FU28_Exercise_Text_Processing.RE;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int indexStart = input.lastIndexOf("\\")+1;

        String result = input.substring(indexStart);
        String []arr = result.split("\\.");
        System.out.printf("File name: %s%n",arr[0]);
        System.out.printf("File extension: %s",arr[1]);

    }
}
