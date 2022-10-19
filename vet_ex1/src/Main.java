import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter how many numbers will be entered: ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("enter the number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i=0; i< vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}