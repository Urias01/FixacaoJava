package personalityexception.boa.model.entities;

import personalityexception.boa.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Reservation() {}

  public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
    if (!checkOut.after(checkIn)){
      throw new DomainException("Error in reservation Check-Out date must be after check-in date");
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

  public Date getcheckIn() {
    return checkIn;
  }

  public void setcheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }

  public Date getcheckOut() {
    return checkOut;
  }

  public void setcheckOut(Date checkOut) {
    this.checkOut = checkOut;
  }

  public long duration() {
    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut){
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now))
      throw new DomainException("Error in reservation dates for update must be future dates");
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Error in reservation Check-Out date must be after check-in date");
    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;

  }

  @Override
  public String toString() {
    return (
      "Room " +
      roomNumber +
      ", " +
      sdf.format(checkIn) +
      ", " +
      sdf.format(checkOut) +
      ", " +
      duration() +
      " nights"
    );
  }
}
