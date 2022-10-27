import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // imprimindo date-time customizado

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern(("dd/MM/yyyy HH:mm"));
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern(("dd/MM/yyyy HH:mm")).withZone(ZoneId.systemDefault()); //Setamos o fuso horario para formatação do Instant pegando o fuso horario do sistema
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT; // formata diretamente  no formato ISO8601 com fuso horario

        LocalDate d01 = LocalDate.parse("2022-10-27");
        LocalDateTime d02 = LocalDateTime.parse("2022-10-27T15:31:37");
        Instant d03 = Instant.parse("2022-10-27T01:31:37Z");

        System.out.println("D01 - " + d01.format(fmt1)); // Imprime com o formato setado
        System.out.println("D01 - " + fmt1.format(d01));
        System.out.println("D01 - " + d01.format(DateTimeFormatter.ofPattern(("dd/MM/yyyy")))); // formatando direntamente, porém a formatação só sera aplicada nesse caso

        System.out.println("D02 - " + d02.format(fmt1));// Mesmo com a hora a formatação ira imprimir somente a data conforme setado
        System.out.println("D02 - " + d02.format(fmt2));

        System.out.println("D03 - " + fmt3.format(d03));// setamos a partir do FMT pois o instant não permite o comando de formatação e na hora da impressão temos o a alteração da hora e data de acordo com o Fuso
        System.out.println("D03 - " + fmt4.format(d03));

    }
}