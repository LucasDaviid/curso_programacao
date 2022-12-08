import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter contract details:");
        System.out.print("\nContact number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        System.out.println("installments:");
        for (Installment installment : contract.getInstalments()){
            System.out.println(installment);
        }

        sc.close();
    }
}