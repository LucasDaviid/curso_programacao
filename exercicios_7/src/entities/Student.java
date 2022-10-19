package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;


    public double finalGrade(){
        return  n1 + n2 + n3;
    }

    public String toString() {
        return "Student: " + name
                + "\nFinal grade: " + String.format("%.2f", finalGrade());
    }

}
