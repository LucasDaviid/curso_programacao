import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Utilização do modelo antigo de data-hora usado pelo Java antes da versão 8

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //instanciando
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//setando formato GMT
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("28/10/2022");// Hora saira como 00 já como não foi setada
        Date y2 = sdf2.parse("28/10/2022 15:18:19");
        Date y3 = Date.from(Instant.parse("2022-10-28T15:36:19Z"));//ISO8601 UTC

        Date x1 = new Date(); //instancia a data e hora atual
        Date x2 = new Date(System.currentTimeMillis()); //Pega a data do sistema, converte em miliseg e cria a data
        Date x3 = new Date(0L); //instanciando com miliseg qualquer
        Date x4 = new Date(1000L * 60L * 60L * 5L); //instanciando data 01/01/1970 5am UTC-3

        System.out.println("x1 - " + sdf2.format(x1));
        System.out.println("x2 - " + sdf2.format(x2));
        System.out.println("x3 - " + sdf2.format(x3));
        System.out.println("x4 - " + sdf2.format(x4));

        System.out.println("\nY1 and Y2 unformatted:\n" + y1 + "\n" + y2);

        System.out.println("\nY1 and Y2 formatted:\n" + sdf1.format(y1));// formata para como foi inserido
        System.out.println(sdf2.format(y2));
        System.out.println("\nY3 - "+sdf2.format(y3));//Por padrão as maquinas imprimem no horario local
        System.out.println("Y3 UTC - " + sdf3.format(y3));
    }
}