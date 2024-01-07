package AmazonNotification;

import AmazonNotification.Observable.CerealObservable;
import AmazonNotification.Observable.IphoneObservable;
import AmazonNotification.Observable.StockObservable;
import AmazonNotification.Observer.EmailObserver;
import AmazonNotification.Observer.MobileObserver;
import AmazonNotification.Observer.Observer;

public class Store {

    public static void main(String args[]) {


        StockObservable iphoneObservable = new IphoneObservable(0);
        StockObservable cerealObservable = new CerealObservable(0);


        Observer mobileObserve1 =  new MobileObserver("Raj");
        Observer mobileObserver2 =  new MobileObserver("Aditya");

        Observer emailObserver1 = new EmailObserver("divyansh@gmail.com");
        Observer emailObserver2 = new EmailObserver("sangeeta@gmail.com");
        Observer emailObserver3 = new EmailObserver("riyaz@gmail.com");


        Observer mobileObserve3 =  new MobileObserver("Jack");
        Observer mobileObserver4 =  new MobileObserver("Daniel");

        Observer emailObserver4 = new EmailObserver("rose@gmail.com");
        Observer emailObserver5 = new EmailObserver("geeta@gmail.com");
        Observer emailObserver6 = new EmailObserver("virat@gmail.com");


        iphoneObservable.add(mobileObserve1);

        cerealObservable.add(mobileObserve1);



        iphoneObservable.add(mobileObserver2);
        iphoneObservable.add(emailObserver1);
        iphoneObservable.add(emailObserver2);
        iphoneObservable.add(emailObserver3);

        // Made the count of iphone to 20. The notifications would be sent to all the subscribers.
        iphoneObservable.setData(20);

        // Add cereal observable subscriber list
        cerealObservable.add(mobileObserver4);
        cerealObservable.add(emailObserver4);
        cerealObservable.add(emailObserver5);
        cerealObservable.add(emailObserver6);


        // Made the count of cereal to 50. The notifications would be sent to all the subscribers.
        cerealObservable.setData(50);






    }
}
