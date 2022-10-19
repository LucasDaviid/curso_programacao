import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Quarter notes: ");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        if (student.finalGrade() < 60){
            System.out.println(student + "\nFailed \nMissing " + (60 - student.finalGrade()) + " Points" );
        }

        else {
            System.out.println(student + "\nPass");
        }

        sc.close();
    }
}