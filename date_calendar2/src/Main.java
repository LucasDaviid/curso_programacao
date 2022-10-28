import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Manipulando data com Calendar

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2022-10-28T15:50:01Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance(); //declarando calendar
        cal.setTime(d); //calendar com a data instanciada
        cal.add(Calendar.HOUR_OF_DAY, 4);// acresentando 4 horas
        d = cal.getTime();

        System.out.println("Update - " + sdf.format(d));

        //Obtendo uma unidade de tempo

        int minutes = cal.get(Calendar.MINUTE);//obtendo os minutos
        int month = 1 + cal.get(Calendar.MONTH);// no calendar o mes começa em 0 por isso acrescentamos +1

        System.out.println("Minutes - " + minutes);
        System.out.println("Month - " + month);
    }
}