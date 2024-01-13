package Uber_LLD;

import Uber_LLD.Entity.Driver;
import Uber_LLD.Entity.Location;
import Uber_LLD.Entity.Rider;
import Uber_LLD.Entity.Trip;
import Uber_LLD.manager.DriverManager;
import Uber_LLD.manager.RiderManager;
import Uber_LLD.manager.TripManager;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {


 //---------------Creating Riders and Drivers--------------------------------

        Rider aditya = new Rider("Aditya");
        Rider naman = new Rider("Naman");

        RiderManager riderManager = RiderManager.getInstance();
        riderManager.addRider(aditya);
        riderManager.addRider(naman);

        Driver driverMallu = new Driver("Mallu");
        Driver driverSallu = new Driver("Sallu");

        DriverManager driverManager = DriverManager.getInstance();
        driverManager.addDriver(driverMallu);
        driverManager.addDriver(driverSallu);

//-------------- Create trip --------------------------------
        TripManager tripManager = TripManager.getInstance();

        Location adityahome = new Location(10, 10);
        Location adityaOffice = new Location(30, 30);

        System.out.println("Creating Trip for Aditya from location (10,10) to (30,30)");
        tripManager.createTrip(aditya,adityahome,adityaOffice);


        Location namanhome = new Location(20, 20);
        Location namanOffice = new Location(30, 30);

        System.out.println("Creating Trip for naman from location (20,20) to (30,30)");
        tripManager.createTrip(naman ,namanhome,namanOffice );

//-------------- Print trip Info--------------------------------

        HashMap<Integer, Trip> tripsMap = tripManager.getTripsInfo();

        for (Map.Entry<Integer, Trip> entry : tripsMap.entrySet()) {
            entry.getValue().displayTripDetails();
        }
        
    }
}
