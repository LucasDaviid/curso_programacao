import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, pair=0;
        double sum = 0, average;

        System.out.print("How many elements will the vector have? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0) {
                sum += vect[i];
                pair++;
            }
        }

        average = sum / pair;

        for (int i=0; i < 1; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("Average of the pairs: %.1f%n" , average);
            }
            else {
                System.out.print("No even numbers.");
            }
        }

        sc.close();
    }
}