package AmazonNotification.Observable;

import AmazonNotification.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CerealObservable implements StockObservable {

    List<Observer> observerList;

    int count;

    public CerealObservable( int count) {
        this.count = count;
        observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for (Observer observer: observerList) {
            observer.update(this);
        }
    }

    @Override
    public void setData(int newCount) {
        if (newCount == 0) {
            System.out.println("The count of product is 0. Cereal is Out of Stock");
            this.count = newCount;
        }
        else if (newCount > 0 ) {
            this.count = newCount;
            System.out.println("Cereal is available now. ");
            notifySubscribers();
        } else {
            System.out.println(" The count of product can't be negetive ");
        }
    }

    @Override
    public int getData() {
        return count;
    }
}
