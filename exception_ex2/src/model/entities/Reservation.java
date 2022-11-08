package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); // Pega a diferença entre as 2 datas em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Converte para dias
    }

    public String updateDate (Date checkIn, Date checkOut){

        Date now = new Date();

        // Os testes agora foram delegados para classe Reservation na operação updateDate

        if (checkIn.before(now) || checkOut.before(now)){
            return "Reservation dates for update must be future dates";
        }

        if (!checkOut.after(checkIn)){
            return "Error in reservation: Check-out date must be after check-in date";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null; // caso retorne null sabemos que não ocorreu nenhum erro
    }

    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
