import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Cálculos com date-time

        Instant d01 = Instant.parse("2022-10-27T01:31:37Z");
        LocalDateTime d02 = LocalDateTime.parse("2022-10-27T01:31:37");
        LocalDate d03 = LocalDate.parse("2022-10-27");

        LocalDate pastWeekLD = d03.minusDays(7); //Subtrai dias
        LocalDate nextWeekLD = d03.plusDays(7); //Adciona dias

        System.out.println("pastWeekLD = " + pastWeekLD);
        System.out.println("nextWeekLD = " + nextWeekLD);

        LocalDateTime pastWeekLDT = d02.minusDays(7);
        LocalDateTime nextWeekLDT = d02.plusDays(7);

        System.out.println("\npastWeekLDT = " + pastWeekLDT);
        System.out.println("nextWeekLDT = " + nextWeekLDT);

        Instant pastWeekInstant = d01.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d01.plus(7, ChronoUnit.DAYS);

        System.out.println("\npastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Duração

        Duration t1 = Duration.between(pastWeekLD.atStartOfDay(), d03.atStartOfDay());// temos que converter o LD para LDT no inicio do dia pois não é suportado
        Duration t2 = Duration.between(pastWeekLDT, d02); //Calcula a duração entre 2 datas

        Duration t3 = Duration.between(pastWeekInstant, d01);// Calcula Instant
        Duration t4 = Duration.between(d01, pastWeekInstant);

        System.out.println("\nT1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println("T3 dias = " + t3.toDays());
        System.out.println("T4 dias = " + t4.toDays());
    }
}