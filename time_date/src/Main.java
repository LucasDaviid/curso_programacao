import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now(); // instancia a data local
        LocalDateTime d02 = LocalDateTime.now(); // instancia a data e hora local com fração de segundos
        Instant d03 = Instant.now(); // instancia a data e hora no horario de Londres

        // toString dos 3 tipos acima por padrão gera no formato ISO8601

        LocalDate d04 = LocalDate.parse("2022-10-27"); // instanciando data no  formato ISO8601
        LocalDateTime d05 = LocalDateTime.parse("2022-10-27T15:31:37"); //ISO8601 com hora
        Instant d06 = Instant.parse("2022-10-27T15:31:37Z");
        Instant d07 = Instant.parse("2022-10-27T15:31:37-03:00"); // instancia o horario setado e imprime o horaro no padrão de Londres

        // Date Time Formatter

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // intanciando a formatação da data, podemos instanciar o formater diretamente no DateTime
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d08 = LocalDate.parse("27/10/2022", fmt1); //sobrecarrega o parse para interpretação de texto setada acima
        LocalDateTime d09 = LocalDateTime.parse("27/10/2022 23:23", fmt2);

        // instanciando isoladamente

        LocalDate d10 = LocalDate.of(2022, 10, 27); // Year, Month, Day
        LocalDateTime d11 = LocalDateTime.of(2022,10,27,23,23);// Year, Month, Day, Hour, Minute


        System.out.println(d01 + "\n" + d02 + "\n" + d03);
        System.out.println(d04 + "\n" + d05 + "\n" + d06);
        System.out.println(d07 + "\n" + d08 + "\n" + d09);
        System.out.println(d10 + "\n" + d11);
    }
}