import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDate(checkIn, checkOut);
            System.out.println("Reservation Update: " + reservation);
        }

        catch (ParseException e){ // Tratamento da ParseException
            System.out.println("Invalid date format!");
        }

        catch (DomainException e){ // aqui é feito o tratamento da DomainException
            System.out.println(e.getMessage());
        }

        catch (RuntimeException e){ // Trata qualquer outra exeção inesperada
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}