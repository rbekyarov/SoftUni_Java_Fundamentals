package FU28_Exercise_Text_Processing.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userNameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        boolean isValidUserName = false;

        for (String userName : userNameList) {

            if (userName.length() >= 3 && userName.length() <= 16) {

                for (int i = 0; i < userName.length(); i++) {
                    char currentSymbol = userName.charAt(i);

                    if (Character.isLetterOrDigit(currentSymbol) || currentSymbol == '_' || currentSymbol == '-') {
                        isValidUserName = true;
                    } else {
                        isValidUserName = false;
                        break;
                    }
                }
                if (isValidUserName) {
                    System.out.println(userName);
                }
            }
        }
    }
}
