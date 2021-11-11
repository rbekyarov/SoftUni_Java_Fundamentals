package FU28_Exercise_Text_Processing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> userName = Arrays.stream(text.split(", ")).collect(Collectors.toList());

        for (int i = 0; i < userName.size(); i++) {

            String currentName = userName.get(i);
            boolean isBigger3 = currentName.length() >= 3;
            boolean isSmaller16 = currentName.length() <= 16;
            if ((isBigger3) && (isSmaller16)) {
                boolean isOnlyDigitAndAlfabet = true;
                for (int j = 0; j <currentName.length() ; j++) {
                    isOnlyDigitAndAlfabet = Character.isLetterOrDigit(currentName.charAt(j));
                     if (!isOnlyDigitAndAlfabet){
                         break;
                     }
                }

                boolean isDash = currentName.contains("-");
                boolean isUnder = currentName.contains("_");
                if ((isOnlyDigitAndAlfabet) || (isDash) || (isUnder)) {
                    System.out.println(currentName);
                }
            }

        }
    }
}