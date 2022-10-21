import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double grades;

        System.out.print("How many students will be entered? ");
        n = sc.nextInt();

        String[] student = new String[n];
        double[] note1 = new double[n];
        double[] note2 = new double[n];

        for (int i=0; i < student.length; i++){
            sc.nextLine();
            System.out.print("Enter student name: ");
            student[i] = sc.nextLine();
            System.out.print("enter the first note: ");
            note1[i] = sc.nextDouble();
            System.out.print("enter the second note: ");
            note2[i] = sc.nextDouble();
        }

        System.out.println("Approved students: ");

        for (int i=0; i < student.length; i++) {
            grades = (note1[i] + note2[i]) / 2;
            if (grades >= 6){
                System.out.println(student[i]);
            }
        }

        sc.close();
    }
}