import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("enter the size of the array: ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMain diagonal:");
        for (int i=0; i< mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        int count = 0;

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("\nNegative numbers: " + count);


        sc.close();
    }
}