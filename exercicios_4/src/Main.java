import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, f;
        char resp;

        do {
            System.out.print("Digite a temperatura em celsius: ");
            c = sc.nextDouble();
            f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Temp. em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja reperetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        System.out.println("Obrigado pela ultilização!");

        sc.close();
    }
}