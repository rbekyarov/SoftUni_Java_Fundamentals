package FU22_Exercise_Objects_and_Classes.Students;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName,String lastName,double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
    @Override
    public String toString(){
        //Rocco Erben: 6.00
        return
        String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
    }
}
