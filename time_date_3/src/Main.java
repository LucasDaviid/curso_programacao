import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        // Convertendo date-time global para local

        Instant d01 = Instant.parse("2022-10-27T01:31:37Z");
        LocalDateTime d02 = LocalDateTime.parse("2022-10-27T01:31:37");
        LocalDate d03 = LocalDate.parse("2022-10-27");

        // ZoneId.getAvailableZoneIds();  -  Coleção com os nomes dos fuso horários customizados

        LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault()); // converte o Instant para um Local date considerando o fuso horario do meu sistema
        LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal")); // converte para um determinado local setado

        LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1 + "\nR2 = " + r2);
        System.out.println("R3 = " + r3 + "\nR4 = " + r4);

        //Obtendo dados da data/hora local

        System.out.println("\nD02 = Hour - " + d02.getHour());// Pega a hora e após o minuto do LocalDateTime
        System.out.println("D02 = Minute - " + d02.getMinute());

        System.out.println("\nD03 = Day - " + d03.getDayOfMonth());// Pega o dia, abaixo o mês e por ultimo o ano do LocalDate
        System.out.println("D03 = Month - " + d03.getMonth());
        System.out.println("D03 = Year - " + d03.getYear());


    }
}