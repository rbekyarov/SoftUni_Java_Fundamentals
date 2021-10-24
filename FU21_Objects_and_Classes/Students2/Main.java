package FU21_Objects_and_Classes.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Students> studentsList = new ArrayList<>();

        while (!command.equals("end")) {
            String[] studentsData = command.split("\\s+");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            int age = Integer.parseInt(studentsData[2]);
            String town = studentsData[3];
            if (isNameExist(firstName,lastName,studentsList)){

            }
            Students studentsMain = new Students(firstName, lastName, age, town);
            studentsList.add(studentsMain);

            command = scanner.nextLine();

        }
        String filterTown = scanner.nextLine();
        for (Students students: studentsList ) {
            if (students.getTownHome().equals(filterTown)){
                System.out.printf("%s %s is %d years old\n",students.getFirstName(),students.getLastName(),students.getAge() );
            }

        }

    }

    private static boolean isNameExist(String firstName, String lastName, List<Students> studentsList) {
        for (Students students:studentsList) {
            if (students.getFirstName().equals(firstName) && students.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }


}
