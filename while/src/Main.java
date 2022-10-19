import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, soma = 0;

        System.out.print("Digite um número: ");
        x = sc.nextInt();

        while (x != 0){
            soma += x;
            System.out.print("Digite um número: ");
            x = sc.nextInt();
        }

        System.out.println("Valores somados = " + soma);

        sc.close();
    }
}