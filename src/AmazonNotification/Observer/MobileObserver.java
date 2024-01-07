package AmazonNotification.Observer;

import AmazonNotification.Observable.StockObservable;

public class MobileObserver implements Observer {

    String userId;

    public MobileObserver(String userId) {
        this.userId = userId;

    }
    @Override
    public void update(StockObservable stockObservable) {
        createPopup();
    }

    private void createPopup() {
        System.out.println(" Notification shown to the user in mobile with id " + userId);
    }
}
