package FU21_Objects_and_Classes.Students2;

public class Students {

    private String firstName;
    private String lastName;
    private int age;
    private String townHome;

    public Students(String firstName, String lastName, int age, String townHome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.townHome = townHome;
    }

    public String getTownHome() {
        return townHome;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
