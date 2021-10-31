package FU22_Exercise_Objects_and_Classes.OrderByAge;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();// създаваме си лист където да съхраняваме обектите
        while (!input.equals("End")){
            String[] dataArr = input.split(" ");
            String name = dataArr[0];
            String id = dataArr[1];
            int age = Integer.parseInt(dataArr[2]);

            Person person = new Person(name,id,age); // създаваме си обект
            people.add(person);// - запазваме обектите в лист
            input = scanner.nextLine();
        }

        //трябва да достъпим всеки обект и да му вземем полето възраст за да може да го филтираме
        //за целта : пускаме стрийм на листа people, филтрираме обектите които са над 30 години
        //people = people.stream().filter(Person -> person.getAge() > 30)
        //.collect(Collectors.toList());
        //ако не отговаря на условието - филтъра премахва от листа обектите с age<0
        // сега трябва да сортираме обектите по име
        people.sort(Comparator.comparing(Person::getAge));

        //Принтираме:
        for (Person person : people) {
            //Stephan with ID: 524244 is 10 years old.
            System.out.println(person.getName() + " with ID: "+person.getId()+" is " + person.getAge()+" years old.");

        }
    }
}

