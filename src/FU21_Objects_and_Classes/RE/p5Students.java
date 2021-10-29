package FU21_Objects_and_Classes.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p5Students {

    public static class Students {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Students> listStudents = new ArrayList<>();
        while (!command.equals("end")) {
            String[] arrStudents = command.split(" ");

            String firstName = arrStudents[0];
            String lastName = arrStudents[1];
            String age = arrStudents[2];
            String homeTown = arrStudents[3];

            Students student = new Students();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(homeTown);

            listStudents.add(student);
            command = scanner.nextLine();
        }
        String input = scanner.nextLine();

        for (Students student : listStudents) {
            if (student.getHomeTown().equals(input)) {

                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
