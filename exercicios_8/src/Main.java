import entities.Currencyconverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        Currencyconverter.dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        Currencyconverter.buy = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n" , Currencyconverter.conversion());
    }
}