import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.1);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2; // We have to perform a casting because the compiler doesn't allow it because we can't get confirmation

       // BusinessAccount acc5 = (BusinessAccount)acc3; - The compiler doesn't know that acc3 is a SavingAccount the problem will only be noticed at runtime

        if (acc3 instanceof BusinessAccount){ // We use instanceof to test if acc3 is a BusinessAcount to continue running the program.
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}