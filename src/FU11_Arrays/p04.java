/*
4.	Reverse an Array of Strings
        Write a program to read an array of strings, reverse it and print its elements.
         The input consists of a sequence of space separated strings.
         Print the output on a single line (space separated).
*/


        package FU11_Arrays;


import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrOfString = scanner.nextLine().split(" ");
        String current = "";
        for (int i = 0; i <arrOfString.length/2 ; i++) {
            current =arrOfString[i];
            arrOfString[i]= arrOfString[arrOfString.length-1-i];
            arrOfString[arrOfString.length-1-i] = current;
        }
        for (String element:arrOfString){
            System.out.print(element+" ");
        }
    }
}
