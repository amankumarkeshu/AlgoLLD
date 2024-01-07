package AmazonNotification.Observable;

import AmazonNotification.Observer.Observer;

public interface StockObservable {


    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifySubscribers();

    public void setData(int data);


    public int getData();

}
