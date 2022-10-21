import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, olderA = 0;
        String older = null;

        System.out.print("How many people will you type? ");
        n = sc.nextInt();

        int[] age = new int[n];
        String[] name = new String[n];

        for (int i=0; i < age.length; i++){
            sc.nextLine();
            System.out.println("Person n" + (i+1) + " data: ");
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            if (age[i] > olderA){
                olderA = age[i];
                older = name[i];
            }
        }

        System.out.print("Older person: " + older);


    }
}