import entities.Numbers;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you type? ");
        n = sc.nextInt();

        Numbers[] vect = new Numbers[n];

        for (int i=0; i < vect.length; i++){
            System.out.print("enter the number: ");
            double number = sc.nextDouble();
            vect[i] = new Numbers(number);
            }

        double hNumber = 0;
        int position = 0;

        for (int i=0; i < vect.length; i++) {
            if (vect[i].getNumber() > hNumber) {
                hNumber = vect[i].getNumber();
                position = i;
            }
        }

        System.out.printf("Higher value = %.1f%n", hNumber);
        System.out.print("Highest value position = " + position);

        sc.close();
    }
}