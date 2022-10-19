import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Insert the desired amount: ");
        n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            System.out.print("Enter the product price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        for (int i=0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}