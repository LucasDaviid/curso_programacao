import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date bDate = sdf.parse(sc.next());

        Client client = new Client(name, email, bDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next()); // leitura e conversão direta de String para orderStatus(enum)

        Order order = new Order(new Date(), status, client);

        System.out.print("How many itens to this order? ");
        int qtd = sc.nextInt();
        for (int i=1; i<=qtd; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); // Consome a quebra de linha que ficou pendente
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc. nextInt();

            Product product = new Product(pName, price);
            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);



        sc.close();
    }
}