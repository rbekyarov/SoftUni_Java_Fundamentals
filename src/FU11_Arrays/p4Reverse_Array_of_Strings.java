package FU11_Arrays;

import java.util.Scanner;

public class p4Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i <input.length/2 ; i++) { // Чрез делено на 2 четем масива до средата
            String temp = input[i]; // нова променлива с тепорари стойност
            input [i]= input [input.length-1-i];//задаваме стойност на последния елемент
            input[input.length-1-i]= temp;//задаваме стойност на пурвия елемент


        }
        System.out.println(String.join(" ",input));
    }
}
