package BookMyShow.booking;

import BookMyShow.Enum.BookingStatus;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;
import BookMyShow.payment.Payment;

import java.util.Date;
import java.util.List;

public class Booking {
    int bookingNumber;
    int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;
    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public static Booking createBooking(Show show, List<ShowSeat> seats, int bookingNumber ) {

        // We will take th booking Manager and add this booking

        Booking booking = new Booking();
        booking.setBookingNumber(bookingNumber);
        booking.setShow(show);
        booking.setSeats(seats);
        return booking;

    }
    public boolean makePayment(Payment payment) {
        payment.makePayment(bookingNumber , payment.getAmount());
        return true;
    }

    public boolean cancel() {
        return true;
    }

    public boolean assignSeats(List<ShowSeat> seats) {
        return true;
    }



}
