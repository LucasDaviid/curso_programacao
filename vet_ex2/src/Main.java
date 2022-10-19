import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter how many numbers will be entered: ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("enter the number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        System.out.print("Values: ");
        for (int i=0; i< vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        double avg = sum / vect.length;
        System.out.printf("%nSum = %.2f%n" , sum);
        System.out.printf("Average = %.2f%n", avg);


        sc.close();
    }
}