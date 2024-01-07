package AmazonNotification.Observer;

import AmazonNotification.Observable.StockObservable;

public interface Observer {

    public void update(StockObservable stockObservable);
}
