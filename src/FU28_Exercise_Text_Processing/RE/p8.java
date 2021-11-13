package FU28_Exercise_Text_Processing.RE;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"P34562Z q2576f   H456z"
        String [] passwords = input.split("\\s+");
        //["P34562Z", "q2576f", "H456z"]
        double totalSum = 0; //общата сума от всички пароли
        for (String password : passwords) {
            //пресметнем стойността на числото
            double modifiedNumber = getModifiedNumber(password);
            //добавяме числото от паролата към сумата
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String password) {
        //{буква}{число}{буква} -> "P34562Z"
        char firstLetter = password.charAt(0); //'P'
        char secondLetter = password.charAt(password.length() - 1); //'Z'

        //първи начин:
        StringBuilder builder = new StringBuilder(password); //"P34562Z"
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());

        //втори начин:
        //double number = Double.parseDouble(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        //трети начин:
        //double number = Double.parseDouble(password.substring(1, password.indexOf(secondLetter)));

        //проверка за първата буква
        //главна -> аски кода >= 65 и <= 90
        if (Character.isUpperCase(firstLetter)) {
            //число = число / позицията на главната буква firstLetter в азбуката
            int positionUpperLetter = (int)firstLetter - 64;
            number /= positionUpperLetter;
        }
        //малка -> аски кода >= 97 и <= 122
        else {
            //число = число * позицията на малката буква firstLetter в азбуката
            int positionLowerLetter = (int)firstLetter - 96;
            number *= positionLowerLetter;
        }

        //проверка за втората буква
        if (Character.isUpperCase(secondLetter)) {
            //число = число - позицията на главната буква secondLetter в азбуката
            int positionUpperLetter = (int)secondLetter - 64;
            number -= positionUpperLetter;
        } else {
            //число = число + позицията на малката буква secondLetter в азбуката
            int positionLowerLetter = (int)secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
