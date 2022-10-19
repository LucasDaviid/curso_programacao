import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String product1 =  "Computer";
        String product2 =  "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

    System.out.printf("Products: %n");
        System.out.printf("Computer, which price is $ " + price1 + "%n");
        System.out.printf("Office desk, which price is $ " + price2 + "%n");

        System.out.printf("Record: " +age+ " years old, code" +code+ " ande gender " +gender+ "%n");

        System.out.printf("Measue with eigth decimal places: " +measure+ "%n");
        System.out.printf("Rouded (Three decimal places): " + "%.3f" ,measure);

    }
}