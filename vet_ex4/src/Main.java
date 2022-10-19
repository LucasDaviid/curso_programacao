import entities.Numbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will be entered? ");
        n = sc.nextInt();

        Numbers[] vect = new Numbers[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            vect[i] = new Numbers(number);
        }

        int evenNumber = 0;

        System.out.print("Pair numbers: ");
        for (int i=0; i< vect.length; i++){
            if (vect[i].getNumber() %2 == 0){
                System.out.print(vect[i].getNumber() + " ");
                evenNumber++;
            }
        }

        System.out.print("\nNumber of pairs = " + evenNumber);

        sc.close();
    }
}