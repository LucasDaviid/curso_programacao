import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alturas deseja calcular? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("insira a altura: ");
            vect [i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }
        double avg = soma/n;

        System.out.printf("A média é: %.2f%n", avg);

        sc.close();
    }
}