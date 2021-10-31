package FU22_Exercise_Objects_and_Classes.OpinionPoll;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();// създаваме си лист където да съхраняваме обектите
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            String[] dataArr = data.split(" ");
            String name = dataArr[0];
            int age = Integer.parseInt(dataArr[1]);

            Person person = new Person(name, age); // създаваме си обект
            if(person.getAge()>30){
                people.add(person);// - запазваме обектите в лист
            }}

            //трябва да достъпим всеки обект и да му вземем полето възраст за да може да го филтираме
            //за целта : пускаме стрийм на листа people, филтрираме обектите които са над 30 години
            //people = people.stream().filter(Person -> person.getAge() > 30)
                    //.collect(Collectors.toList());
            //ако не отговаря на условието - филтъра премахва от листа обектите с age<0
               // сега трябва да сортираме обектите по име
            people.sort(Comparator.comparing(Person::getName));

            //Принтираме:
            for (Person person :people) {
                System.out.println(person.getName()+" - "+person.getAge());

            }
        }
    }

