package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {

        if (!checkOut.after(checkIn)){ //defensive programming - tratar a exeção no inicio do metodo. Nesse caso o Try será interrompido caso a data de check-out seja anterior a de check-in
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

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

    public void updateDate (Date checkIn, Date checkOut) throws DomainException { // aqui foi colocado o throws DomainException para que a exeção seja propagada e tratada no Main.

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
            // aqui setamos a exeção personalizada para ser lançada
        }

        if (!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
