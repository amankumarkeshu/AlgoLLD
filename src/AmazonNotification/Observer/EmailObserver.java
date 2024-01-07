package AmazonNotification.Observer;

import AmazonNotification.Observable.StockObservable;

public class EmailObserver implements  Observer {

    String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(StockObservable stockObservable) {
        sendEmail(stockObservable.getData());
    }
    private void sendEmail(int data) {
        System.out.println("The count of product is" + data + "and Email has been sent to " + email);
    }
}
