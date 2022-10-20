import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many people will be entered: ");
        n = sc.nextInt();

        People[] vect = new People[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            System.out.println("Person n" + (i+1) + " data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);
        }

        double sum = 0;
        for (int i=0; i< vect.length; i++){
            sum += vect[i].getHeight();
        }

        double avg = sum / vect.length;

        System.out.printf("Average height: %.2f%n", avg);


        int cont=0;
        for (int i=0; i< vect.length; i++){
            if (vect[i].getAge() < 16){
                cont++;
            }
        }

        double percent = cont * 100.0 / n;
        System.out.printf("Persons under the age of 16: %.1f%%%n", percent);

        for (int i=0; i< vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}