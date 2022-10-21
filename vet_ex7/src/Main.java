import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum, average;

        System.out.print("How many elements will the vector have? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i=0; i<n; i++) {
            sum = sum + vect[i];
        }

        average = sum / n;

        System.out.printf("Vector average = %.3f", average);
        System.out.println("\nBelow-average items: ");

        for (int i=0; i<n; i++) {
            if (vect[i] < average) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();
    }
}