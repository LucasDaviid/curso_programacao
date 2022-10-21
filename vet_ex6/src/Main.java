import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;


        System.out.print("How many values will each vector have? ");
        n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Enter the values of vector A: ");
        for (int i=0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B: ");
        for (int i=0; i< vectB.length; i++){
            vectB[i] = sc.nextInt();
        }

        for (int i=0; i< vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Resulting Vector:");

        for(int i=0; i<n; i++) {
            System.out.println(vectC[i]);
        }
        sc.close();
    }
}