import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Inclui um elemento na posição informada

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------");

        list.remove("Anna"); // Capaz de reconhecer e remover o valor setado
        list.remove (1); // Remove o elemento na posição indicada
        list.removeIf(x -> x.charAt(0) == 'M'); // Função lambda predicado

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Encontra a posição do elemento, quando não encontra o elemento retorna como -1

    }
}