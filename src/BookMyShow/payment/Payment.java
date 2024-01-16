package BookMyShow.payment;

import BookMyShow.Enum.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;

    public double getAmount() {
        return amount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public Boolean makePayment(int bookingId, double amount) {

        // We will fetch the booking with booking id and then update the booking with status as complete after
        // the payment is made

        return true;
    }


}
