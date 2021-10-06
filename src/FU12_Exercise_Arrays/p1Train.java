package FU12_Exercise_Arrays;

import java.util.Scanner;

public class p1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] people = new int[n];
        int sumPeople = 0;
        for (int i = 0; i < n; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());
            sumPeople += people[i];
            System.out.printf("%d ",people[i]);
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
