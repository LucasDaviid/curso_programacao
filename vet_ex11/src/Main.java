import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, men=0, women=0;
        double  shortestH, greaterH, womenH, womenF = 0;

        System.out.print("How many people will be entered? ");
        n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i=0; i < n; i++){
            System.out.print("person's height: ");
            height[i] = sc.nextDouble();
            System.out.print("person's gender (F or M): ");
            gender[i] = sc.next().charAt(0);
        }

        shortestH = height[0];
        greaterH = height[0];

        for (int i=0; i<n; i++) {
            if (height[i] > greaterH) {
                greaterH = height[i];
            }
            if (height[i] < shortestH) {
                shortestH = height[i];
            }
        }


        for (int i=0; i<n; i++) {
            if (gender[i] == 'M' ) {
                men++;
            }
            else {
                women++;
                womenF += height[i];
            }
        }

        womenH = womenF / women;

        System.out.printf("shortest height - %.2f" , shortestH);
        System.out.printf("\nGreatest height - %.2f" , greaterH);
        System.out.printf("\nAverage height of women - %.2f" , womenH);
        System.out.printf("\nNumber of men - %d" , men);

        sc.close();
    }
}