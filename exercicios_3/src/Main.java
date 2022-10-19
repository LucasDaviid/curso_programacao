import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, disel = 0, cod =0;

        while ( cod != 4){
            System.out.print("Insira o codígo: ");
            cod = sc.nextInt();

            if (cod == 1){
                alcool += 1;
            }
            else if (cod == 2 ) {
                gasolina += 1;
            }
            else if (cod == 3) {
                disel += 1;
            }
            else if (cod <= 0 || cod > 4) {
                System.out.println("Codígo incorreto!");
            }
            else {
                System.out.println("Muito obrigado!");
            }
        }

        System.out.println("Alcool - " + alcool);
        System.out.println("Gasolina - " + gasolina);
        System.out.println("Disel - " + disel);

        sc.close();
    }
}